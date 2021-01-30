package com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel;

import com.google.gson.annotations.SerializedName;

public class AllAlbums {

    @SerializedName("albums")
    private TopAlbums topAlbums;

    public TopAlbums getTopAlbums() {
        return topAlbums;
    }
}
