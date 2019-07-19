package com.example.gardeshgari.model;

public class ProvinceModel {
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

        public ProvinceModel build() {
            return new ProvinceModel(name, imageUrl);
        }
    }

    private ProvinceModel(String name, String imageUrl) {
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
