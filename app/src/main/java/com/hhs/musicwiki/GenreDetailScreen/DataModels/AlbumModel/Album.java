package com.hhs.musicwiki.GenreDetailScreen.DataModels.AlbumModel;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistInfo;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ImageInfo;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.RankAttr;

import java.util.ArrayList;

public class Album {
    private String name;
    private String mbid;
    private String url;

    @SerializedName("artist")
    private ArtistInfo albumArtist;

    @SerializedName("image")
    private ArrayList<ImageInfo> image;

    @SerializedName("@attr")
    private RankAttr rankAttr;

    public String getName() {
        return name;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public ArtistInfo getAlbumArtist() {
        return albumArtist;
    }

    public ArrayList<ImageInfo> getImage() {
        return image;
    }

    public RankAttr getRankAttr() {
        return rankAttr;
    }
}
