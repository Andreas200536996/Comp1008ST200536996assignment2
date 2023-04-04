package com.example.comp1008st200536996assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

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

    @FXML
    private Label errorMessage;

    private Library library;

    @FXML
    void addBook() {

        String newTitle;
        String newAuthor;
        double newPrice;

        newTitle = titleInput.getText();
        newAuthor = authorInput.getText();
        newPrice = Double.parseDouble(priceInput.getText());
        if (newPrice < 0) {
            errorMessage.setVisible(true);
            errorMessage.setText("Price of book must not be negative.");
        }
        if (newPrice > 0) {
            Book addedBook = new Book(newTitle, newPrice, newAuthor);
            library.addBookToShelf(addedBook);

            bookshelfView.getItems().addAll(addedBook);

            totalPriceLabel.setText(String.format("Value: $%.2f", library.getTotalValueOfLibrary()));
            totalBookShelfLabel.setText("Total Books: " + library.getSizeOfLibrary());
        }

    }



    @FXML
    void displayBook(MouseEvent event) {
        Book selectedBook = bookshelfView.getSelectionModel().getSelectedItem();
        System.out.println(selectedBook);

        titleLabel.setText(selectedBook.getTitle());
        priceLabel.setText(String.format("$%.2f", selectedBook.getPrice()));
        authorLabel.setText(selectedBook.getAuthor());
        bookImageView.setImage(selectedBook.getImage());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        library = new Library();

        errorMessage.setVisible(false);


        Book bookOne = new Book("Red Rising", 30.23, "Pierce Brown");
        library.addBookToShelf(bookOne);

        Book bookTwo = new Book("Percy Jackson", 12.32, "Rick Riordan");
        library.addBookToShelf(bookTwo);

        Book bookThree = new Book("Warriors", 10.99, "Erin Hunter");
        library.addBookToShelf(bookThree);

        library.getBookShelf();

        totalPriceLabel.setText(String.format("Total Value: $%.2f", library.getTotalValueOfLibrary()));
        totalBookShelfLabel.setText("Total Books: " + library.getSizeOfLibrary());

        bookshelfView.getItems().addAll(library.getBookShelf());




    }
}
