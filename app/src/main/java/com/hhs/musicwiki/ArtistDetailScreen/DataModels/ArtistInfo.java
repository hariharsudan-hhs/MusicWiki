package com.hhs.musicwiki.ArtistDetailScreen.DataModels;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.AlbumDetailScreen.DataModels.AlbumTags;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ImageInfo;

import java.util.ArrayList;

public class ArtistInfo {
    private String name;
    private String mbid;
    private String url;

    @SerializedName("image")
    private ArrayList<ImageInfo> imageInfo;

    private long streamable;
    private long ontour;

    @SerializedName("stats")
    private ArtistStats artistStats;

    @SerializedName("similar")
    private ArtistsSimilar artistsSimilar;

    @SerializedName("tags")
    private AlbumTags albumTags;

    @SerializedName("bio")
    private ArtistBio artistBio;

    public String getName() {
        return name;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public ArrayList<ImageInfo> getImageInfo() {
        return imageInfo;
    }

    public long getStreamable() {
        return streamable;
    }

    public long getOntour() {
        return ontour;
    }

    public ArtistsSimilar getArtistsSimilar() {
        return artistsSimilar;
    }

    public ArtistStats getArtistStats() {
        return artistStats;
    }

    public AlbumTags getAlbumTags() {
        return albumTags;
    }

    public ArtistBio getArtistBio() {
        return artistBio;
    }
}
