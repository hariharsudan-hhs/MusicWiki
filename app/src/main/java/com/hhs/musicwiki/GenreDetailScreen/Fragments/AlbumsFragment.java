package com.hhs.musicwiki.GenreDetailScreen.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.hhs.musicwiki.AlbumDetailScreen.AlbumDetailActivity;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel.Album;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel.AllAlbums;
import com.hhs.musicwiki.GenreDetailScreen.FragmentAdapters.AlbumsRecyclerAdapter;
import com.hhs.musicwiki.LastFmApi.LastFmApi;
import com.hhs.musicwiki.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlbumsFragment extends Fragment {

    private RecyclerView recyclerView;
    private AlbumsRecyclerAdapter albumsRecyclerAdapter;
    private ArrayList<Album> albumArrayList = new ArrayList<>();

    private String genreName;

    private ShimmerFrameLayout mShimmerViewContainer;

    private String TAG = "AlbumsFragment";

    public AlbumsFragment(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_albums, container, false);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getString(R.string.base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LastFmApi lastFmApi = retrofit.create(LastFmApi.class);

        Call<AllAlbums> allAlbumsCall = lastFmApi.getAlbums(getString(R.string.tag_gettopalbums), genreName, getString(R.string.api_key), getString(R.string.json));

        getAllAlbums(allAlbumsCall);

        mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);
        recyclerView = view.findViewById(R.id.recycler_view);

        return view;
    }

    void getAllAlbums(Call<AllAlbums> call) {
        call.enqueue(new Callback<AllAlbums>() {
            @Override
            public void onResponse(Call<AllAlbums> call, Response<AllAlbums> response) {
                if(!response.isSuccessful()) {
                    Log.d(TAG, "onResponse: error retrieving data");
                    return;
                }
                assert response.body() != null;
                albumArrayList = new ArrayList<Album>(response.body().getTopAlbums().getAlbumList());
                albumsRecyclerAdapter = new AlbumsRecyclerAdapter(getContext(), albumArrayList);
                RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(), 2);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(albumsRecyclerAdapter);

                mShimmerViewContainer.stopShimmerAnimation();
                mShimmerViewContainer.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<AllAlbums> call, Throwable t) {
                Log.d(TAG, "onResponse: retrofit failure");
            }
        });
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        mShimmerViewContainer.startShimmerAnimation();
//    }
//
//    @Override
//    public void onPause() {
//        mShimmerViewContainer.stopShimmerAnimation();
//        super.onPause();
//    }
}