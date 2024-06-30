package com.example.secondchanceapp;

public class CardItem {
    private int imageResource;
    private String title;
    private String price;

    public CardItem(int imageResource, String title, String price) {
        this.imageResource = imageResource;
        this.title = title;
        this.price = price;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
}
