package com.example.bakingapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class steps {


    @SerializedName( "id" )
    @Expose
    private int Id;
    @SerializedName ( "shortDescription" )
    @Expose
    private String shortDescription;

    @SerializedName ( "description" )
    @Expose
    private String description;
    @SerializedName ( "videoURL" )
    @Expose
    private String videoURL;

    @SerializedName ( "thumbnailURL" )
    @Expose
    private String thumbnailURL;

    /*Constructors*/
    public steps ( int id , String shortDescription , String description , String videoURL , String thumbnailURL ) {
        Id=id;
        this.shortDescription=shortDescription;
        this.description=description;
        this.videoURL=videoURL;
        this.thumbnailURL=thumbnailURL;
    }

    public steps () {
    }

    /*Setter & Getter*/
    public int getId () {
        return Id;
    }

    public void setId ( int id ) {
        Id=id;
    }

    public String getShortDescription () {
        return shortDescription;
    }

    public void setShortDescription ( String shortDescription ) {
        this.shortDescription=shortDescription;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description=description;
    }

    public String getVideoURL () {
        return videoURL;
    }

    public void setVideoURL ( String videoURL ) {
        this.videoURL=videoURL;
    }

    public String getThumbnailURL () {
        return thumbnailURL;
    }

    public void setThumbnailURL ( String thumbnailURL ) {
        this.thumbnailURL=thumbnailURL;
    }
}
