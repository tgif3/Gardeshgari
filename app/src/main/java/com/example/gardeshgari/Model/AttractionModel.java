package com.example.gardeshgari.Model;

public class AttractionModel {
    private String id;
    private String title;
    private String imageUrl;
    private String address;
    private String ostan;
    private String type;
    private String description;

    public static class Builder {
        private String id;
        private String title;
        private String imageUrl;
        private String address;
        private String ostan;
        private String type;
        private String description;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
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

        public AttractionModel build() {
            return new AttractionModel(id, title, imageUrl, address, type, ostan, description);
        }
    }

    private AttractionModel(String id, String title, String imageUrl, String address, String type, String ostan, String description) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.address = address;
        this.type = type;
        this.ostan = ostan;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public String getType() { return type; }

    public String getOstan() {
        return ostan;
    }

    public String getDescription() {
        return description;
    }
}
