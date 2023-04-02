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
        if (title.length() >= 2)
            this.title = title;
        else
            throw new IllegalArgumentException("Title must be longer than 2 letters.");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price of book must not be a negative value.");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() >= 4)
            this.author = author;
        else
            throw new IllegalArgumentException("Author name must be more than 4 letters long.");
    }
    
    public Image getImage() {
        String imageLink = "images/" + title + ".jpg";
        return new Image(Book.class.getResourceAsStream(imageLink));
    }

    public String toString() {
        return (title + " by " + author);
    }
}



