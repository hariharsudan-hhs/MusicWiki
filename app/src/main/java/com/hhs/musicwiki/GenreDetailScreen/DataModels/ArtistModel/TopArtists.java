package com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistModel;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.TagAttr;

import java.util.ArrayList;

public class TopArtists {
    @SerializedName("artist")
    private ArrayList<Artist> artistList;

    @SerializedName("@attr")
    private TagAttr tagAttr;

    public ArrayList<Artist> getArtistList() {
        return artistList;
    }

    public TagAttr getTagAttr() {
        return tagAttr;
    }
}
