package com.rico.cobafragment.model;

public class modelDatar {
    private String namaBangun;
    private String imageUrl;

    public modelDatar(String namaBangun, String imageUrl) {
        this.namaBangun = namaBangun;
        this.imageUrl = imageUrl;
    }

    public String getNamaBangun() {
        return namaBangun;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
