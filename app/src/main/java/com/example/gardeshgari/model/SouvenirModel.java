package com.example.gardeshgari.model;

public class SouvenirModel {
    private String name;
    private String imageUrl;
    private String province;
    private String description;

    public static class Builder {
        private String name;
        private String imageUrl;
        private String province;
        private String description;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder withProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public SouvenirModel build() {
            return new SouvenirModel(name, imageUrl, province, description);
        }
    }

    private SouvenirModel(String name, String imageUrl, String province, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.province = province;
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

    public String getProvince() {
        return province;
    }
}
