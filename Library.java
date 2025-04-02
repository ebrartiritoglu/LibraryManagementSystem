// services/Library.java - Manages library operations

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // List to store books

    // Constructor to initialize the library
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    // Display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search for a book by title
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Borrow a book from the library
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return a borrowed book to the library
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
