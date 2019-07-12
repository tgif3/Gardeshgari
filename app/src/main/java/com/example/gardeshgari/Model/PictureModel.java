package com.example.gardeshgari.Model;

public class PictureModel {
    private String id;
    private String attractionId;
    private String imageUrl;

    public static class Builder {
        private String id;
        private String attractionId;
        private String imageUrl;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withAttractionId(String attractionId) {
            this.attractionId = attractionId;
            return this;
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public PictureModel build() {
            return new PictureModel(id, attractionId, imageUrl);
        }
    }

    private PictureModel(String id, String attractionId, String imageUrl) {
        this.id = id;
        this.attractionId = attractionId;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getAttractionId() {
        return attractionId;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
