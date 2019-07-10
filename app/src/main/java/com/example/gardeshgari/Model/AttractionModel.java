package com.example.gardeshgari.Model;

public class AttractionModel {
    private String imageTitle;
    private String imageUrl;
    private String location;

    public AttractionModel(String imageTitle, String imageUrl) {
        this.imageTitle = imageTitle;
        this.imageUrl = imageUrl;
    }

    public AttractionModel(String imageTitle, String imageUrl, String location) {
        this.imageTitle = imageTitle;
        this.imageUrl = imageUrl;
        this.location = location;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
