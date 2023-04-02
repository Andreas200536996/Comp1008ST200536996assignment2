package com.example.comp1008st200536996assignment2;

import javafx.scene.image.Image;

public class Book {
    private String title;
    private double price;
    private String author;



    public Book(String title, double price, String author) {
        setTitle(title);
        setPrice(price);
        setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Image getImage() {
        String imageLink = "images/" + title + ".jpg";
        return new Image(Book.class.getResourceAsStream(imageLink));
    }

    public String toString() {
        return (title + " by " + author);
    }
}



