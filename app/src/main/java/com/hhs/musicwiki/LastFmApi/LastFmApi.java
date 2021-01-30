package com.hhs.musicwiki.LastFmApi;

import com.hhs.musicwiki.AlbumDetailScreen.DataModels.Album;
import com.hhs.musicwiki.ArtistDetailScreen.DataModels.Artist;
import com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTopAlbumModels.ArtistTopAlbums;
import com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTopTracksModels.ArtistTopTracks;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel.AllAlbums;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistModel.AllArtists;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.TrackModel.AllTracks;
import com.hhs.musicwiki.GenreDetailScreen.Models.GenreInfo;
import com.hhs.musicwiki.HomeScreen.Models.AllGenres;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LastFmApi {

    //tag.getTopTags
    @GET("2.0/")
    Call<AllGenres> getGenres(
            @Query("method") String allGenres,
            @Query("api_key") String apiKey,
            @Query("format") String json
            );

    //tag.getInfo
    @GET("2.0/")
    Call<GenreInfo> getGenreInfo(
            @Query("method") String genreInfo,
            @Query("tag") String genre,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //tag.getTopAlbums
    @GET("2.0/")
    Call<AllAlbums> getAlbums(
            @Query("method") String allAlbums,
            @Query("tag") String genre,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //tag.getTopArtists
    @GET("2.0/")
    Call<AllArtists> getArtists(
            @Query("method") String allArtists,
            @Query("tag") String genre,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //tag.getTopTracks
    @GET("2.0/")
    Call<AllTracks> getTracks(
            @Query("method") String allTracks,
            @Query("tag") String genre,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //album.getInfo
    @GET("2.0/")
    Call<Album> getAlbumInfo(
            @Query("method") String albumInfo,
            @Query("api_key") String apiKey,
            @Query("artist") String artist,
            @Query("album") String album,
            @Query("format") String json
    );

    //artist.getInfo
    @GET("2.0/")
    Call<Artist> getArtistInfo(
            @Query("method") String artistInfo,
            @Query("artist") String artist,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //artist.getTopTracks
    @GET("2.0/")
    Call<ArtistTopTracks> getArtistTopTracks(
            @Query("method") String artistTopTracks,
            @Query("artist") String artist,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

    //artist.getTopAlbums
    @GET("2.0/")
    Call<ArtistTopAlbums> getArtistTopAlbums(
            @Query("method") String artistTopAlbums,
            @Query("artist") String artist,
            @Query("api_key") String apiKey,
            @Query("format") String json
    );

}
