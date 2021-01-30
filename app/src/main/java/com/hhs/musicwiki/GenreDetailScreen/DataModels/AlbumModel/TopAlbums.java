package com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel.Album;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.TagAttr;

import java.util.ArrayList;

public class TopAlbums {
    @SerializedName("album")
    private ArrayList<Album> albumList;

    @SerializedName("@attr")
    private TagAttr tagAttr;

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public TagAttr getTagAttr() {
        return tagAttr;
    }
}
