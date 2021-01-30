package com.hhs.musicwiki.ArtistDetailScreen.DataModels;

import com.google.gson.annotations.SerializedName;

public class Artist {
    @SerializedName("artist")
    private ArtistInfo artistInfo;

    public ArtistInfo getArtistInfo() {
        return artistInfo;
    }
}
