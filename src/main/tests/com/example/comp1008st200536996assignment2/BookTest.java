package com.example.comp1008st200536996assignment2;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class BookTest {

    private Book book;

    @org.junit.Before
    public void setUp() throws Exception {
       book = new Book("Harry Potter", 12.98, "J.K. Rowling");
    }

    @org.junit.Test
    public void setTitle() {
        book.setTitle("Red Rising");
        assertEquals("Red Rising", book.getTitle());
    }
    @org.junit.Test
    public void setInvalidTitle() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setTitle("R");
        });
    }


    @org.junit.Test
    public void setPrice() {
        book.setPrice(12.79);
        assertEquals(12.79, book.getPrice(), 0.0);
    }

    @org.junit.Test
    public void setInvalidPrice() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setPrice(-11.29);
        });
    }

    @org.junit.Test
    public void setAuthor() {
        book.setAuthor("Pierce Brown");
        assertEquals("Pierce Brown", book.getAuthor());
    }

    @org.junit.Test
    public void setInvalidAuthor() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            book.setAuthor("P");
        });
    }
}