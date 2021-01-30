package com.hhs.musicwiki.AlbumDetailScreen.DataModels;

import com.google.gson.annotations.SerializedName;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.ArtistInfo;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.RankAttr;
import com.hhs.musicwiki.GenreDetailScreen.DataModels.TrackModel.Streamable;

public class AlbumTrack {
    private String name;
    private String url;
    private long duration;

    @SerializedName("@attr")
    private RankAttr rankAttr;

    private Streamable streamable;

    @SerializedName("artist")
    private ArtistInfo artistInfo;
}
