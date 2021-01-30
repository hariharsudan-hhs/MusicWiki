package com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTopAlbumModels;

import com.google.gson.annotations.SerializedName;

public class ArtistTopAlbums {

    @SerializedName("topalbums")
    private ArtistTopAlbum artistTopAlbum;

    public ArtistTopAlbum getArtistTopAlbum() {
        return artistTopAlbum;
    }
}
