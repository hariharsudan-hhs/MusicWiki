package com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTopAlbumModels;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTagAttr;

import java.util.ArrayList;

public class ArtistTopAlbum {

    @SerializedName("album")
    private ArrayList<TopAlbum> topAlbumArrayList;

    @SerializedName("@attr")
    private ArtistTagAttr artistTagAttr;

    public ArrayList<TopAlbum> getTopAlbumArrayList() {
        return topAlbumArrayList;
    }

    public ArtistTagAttr getArtistTagAttr() {
        return artistTagAttr;
    }
}
