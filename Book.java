// models/Book.java - Represents a book in the library system

public class Book {
    private String title; // Title of the book
    private String author; // Author of the book
    private boolean isBorrowed; // Status of the book (borrowed or available)

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getter for book title
    public String getTitle() {
        return title;
    }

    // Getter for book author
    public String getAuthor() {
        return author;
    }

    // Check if the book is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Mark the book as borrowed
    public void borrowBook() {
        this.isBorrowed = true;
    }

    // Mark the book as returned
    public void returnBook() {
        this.isBorrowed = false;
    }

    // String representation of the book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Status: " + (isBorrowed ? "Borrowed" : "Available");
    }
}
