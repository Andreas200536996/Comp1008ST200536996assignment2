package com.example.comp1008st200536996assignment2;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookShelf;

    public Library() {
        this.bookShelf = new ArrayList<>();
    }

    public ArrayList<Book> addBookToShelf(Book book) {
        bookShelf.add(book);
        return bookShelf;
    }

    public ArrayList<Book> getBookShelf() {
        return bookShelf;
    }

    public double getTotalValueOfLibrary() {
        double totalValue = 0;
        for (int i=0; i<=bookShelf.size()-1; i++ ) {
            totalValue += bookShelf.get(i).getPrice();
        }
        return totalValue;
    }

    public int getSizeOfLibrary() {
        return bookShelf.size();
    }
}
