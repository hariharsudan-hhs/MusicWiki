package com.hhs.musicwiki.GenreDetailScreen.FragmentAdapters;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel.Album;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistModel.Artist;
import com.hhs.musicwiki.GenreDetailScreen.Fragments.AlbumsFragment;
import com.hhs.musicwiki.GenreDetailScreen.Fragments.ArtistsFragment;
import com.hhs.musicwiki.GenreDetailScreen.Fragments.TracksFragment;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {

    int totalTabs;
    String genreName;

    public FragmentAdapter(FragmentManager fm, int totalTabs, String genreName) {
        super(fm);
        this.totalTabs = totalTabs;
        this.genreName = genreName;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AlbumsFragment albumsFragment = new AlbumsFragment(genreName);
                return albumsFragment;
            case 1:
                ArtistsFragment artistsFragment = new ArtistsFragment(genreName);
                return artistsFragment;
            case 2:
                TracksFragment tracksFragment = new TracksFragment(genreName);
                return tracksFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}