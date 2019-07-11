package com.example.gardeshgari.Model;

public class SouvenirModel {
    private String name;
    private String imageUrl;
    private String ostan;
    private String description;

    public static class Builder {
        private String name;
        private String imageUrl;
        private String ostan;
        private String description;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder withOstan(String ostan) {
            this.ostan = ostan;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public SouvenirModel build() {
            return new SouvenirModel(name, imageUrl, ostan, description);
        }
    }

    private SouvenirModel(String name, String imageUrl, String ostan, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.ostan = ostan;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getOstan() {
        return ostan;
    }
}
