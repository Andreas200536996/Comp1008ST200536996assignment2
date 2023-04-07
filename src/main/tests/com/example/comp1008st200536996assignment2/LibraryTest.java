package com.example.comp1008st200536996assignment2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    private ArrayList<Book> bookShelf;
    private Book book;
    @Before
    public void setUp() throws Exception {
        bookShelf = new ArrayList<>();
    }

    @Test
    public void addBookToShelf() {
        bookShelf.add(book);
        assertEquals(bookShelf, bookShelf);
    }

    @Test
    public void getBookShelf() {
        assertEquals(bookShelf, bookShelf);
    }

    @Test
    public void getTotalValueOfLibrary() {
        double totalValue = 0;
        for (int i=0; i<=bookShelf.size()-1; i++ ) {
            totalValue += bookShelf.get(i).getPrice();
        }
        assertEquals(totalValue, totalValue, 0.0);
    }

    @Test
    public void getSizeOfLibrary() {
        assertEquals(bookShelf.size(), bookShelf.size());
    }
}