package com.hhs.musicwiki.ArtistDetailScreen.DataModels.ArtistTopAlbumModels;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistInfo;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ImageInfo;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.RankAttr;

import java.util.ArrayList;

public class TopAlbum {
    private String name;
    private long playcount;
    private String mbid;
    private String url;

    @SerializedName("artist")
    private ArtistInfo artistInfo;

    @SerializedName("image")
    private ArrayList<ImageInfo> imageInfoArrayList;

    public String getName() {
        return name;
    }

    public long getPlaycount() {
        return playcount;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public ArtistInfo getArtistInfo() {
        return artistInfo;
    }

    public ArrayList<ImageInfo> getImageInfoArrayList() {
        return imageInfoArrayList;
    }
}
