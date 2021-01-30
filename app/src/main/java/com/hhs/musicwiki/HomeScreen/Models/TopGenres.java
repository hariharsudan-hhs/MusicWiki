package com.hhs.musicwiki.HomeScreen.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TopGenres {

    @SerializedName("@attr")
    private TagAttr tagAttr;

    @SerializedName("tag")
    private ArrayList<Genre> genres;

    public ArrayList<Genre> getGenres() {
        return genres;
    }
}
