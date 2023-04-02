package com.example.comp1008st200536996assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class LibraryViewController implements Initializable {

    @FXML
    private TextField authorInput;

    @FXML
    private Label authorLabel;

    @FXML
    private ImageView bookImageView;

    @FXML
    private ListView<Book> bookshelfView;

    @FXML
    private TextField priceInput;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField titleInput;

    @FXML
    private Label titleLabel;

    @FXML
    private Label totalBookShelfLabel;

    @FXML
    private Label totalPriceLabel;

    private Library library;

    @FXML
    void addBook() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        library = new Library();

        Book bookOne = new Book("Red Rising", 30.23, "Pierce Brown");
        library.addBookToShelf(bookOne);

        Book bookTwo = new Book("Percy Jackson", 12.32, "Rick Riordan");
        library.addBookToShelf(bookTwo);

        Book bookThree = new Book("Warriors", 10.99, "Erin Hunter");
        library.addBookToShelf(bookThree);

        library.getBookShelf();

        totalPriceLabel.setText(String.format("Value: $%.2f", library.getTotalValueOfLibrary()));
        totalBookShelfLabel.setText("Total Books: " + library.getSizeOfLibrary());

        bookshelfView.getItems().addAll(library.getBookShelf());




    }
}
