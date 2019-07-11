package com.example.gardeshgari.Model;

public class OstanModel {
    private String name;
    private String imageUrl;

    public static class Builder {
        private String name;
        private String imageUrl;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public OstanModel build() {
            return new OstanModel(name, imageUrl);
        }
    }

    private OstanModel(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}