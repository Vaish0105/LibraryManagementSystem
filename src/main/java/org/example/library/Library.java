package org.example.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    // Store all books
    private List<Book> books = new ArrayList<>();

    // Store all users
    private List<User> users = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Delete a book
    public void deleteBook(int bookId) throws BookNotFoundException {

        Book selectedBook = null;

        // Find the book
        for (Book book : books) {
            if (book.getId() == bookId) {
                selectedBook = book;
                break;
            }
        }

        // Throw custom exception if book does not exist
        if (selectedBook == null) {
            throw new BookNotFoundException(
                    "Book with ID " + bookId + " was not found!"
            );
        }

        // Remove the book
        books.remove(selectedBook);

        System.out.println("\nBook deleted successfully!");
        System.out.println("Deleted Book: " + selectedBook.getTitle());
    }

    // Normal search using a for loop
    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nBook found!");
                System.out.println(book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook not found!");
        }
    }

    // Search using Stream and Optional
    public void searchBookUsingStream(String title) {

        Optional<Book> result = books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();

        if (result.isPresent()) {
            System.out.println("\nBook found using Stream!");
            System.out.println(result.get());
        } else {
            System.out.println("\nBook not found using Stream!");
        }
    }

    // Add a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully!");
    }

    // Display all users
    public void displayUsers() {
        System.out.println("\n--- Library Users ---");

        for (User user : users) {
            System.out.println(user);
        }
    }

    // Issue a book
    public void issueBook(int bookId, int userId) throws BookNotFoundException {

        Book selectedBook = null;
        User selectedUser = null;

        // Find the book
        for (Book book : books) {
            if (book.getId() == bookId) {
                selectedBook = book;
                break;
            }
        }

        // Find the user
        for (User user : users) {
            if (user.getId() == userId) {
                selectedUser = user;
                break;
            }
        }

        // Throw custom exception if book does not exist
        if (selectedBook == null) {
            throw new BookNotFoundException(
                    "Book with ID " + bookId + " was not found!"
            );
        }

        // Check if user exists
        if (selectedUser == null) {
            System.out.println("\nUser not found!");
            return;
        }

        // Check whether book is available
        if (!selectedBook.isAvailable()) {
            System.out.println("\nBook is already issued!");
            return;
        }

        // Issue the book
        selectedBook.setAvailable(false);

        System.out.println("\nBook issued successfully!");
        System.out.println("Book: " + selectedBook.getTitle());
        System.out.println("Issued to: " + selectedUser.getName());
    }

    // Return a book
    public void returnBook(int bookId) throws BookNotFoundException {

        Book selectedBook = null;

        // Find the book
        for (Book book : books) {
            if (book.getId() == bookId) {
                selectedBook = book;
                break;
            }
        }

        // Throw custom exception if book does not exist
        if (selectedBook == null) {
            throw new BookNotFoundException(
                    "Book with ID " + bookId + " was not found!"
            );
        }

        // Check if book is already available
        if (selectedBook.isAvailable()) {
            System.out.println("\nThis book has not been issued!");
            return;
        }

        // Return the book
        selectedBook.setAvailable(true);

        System.out.println("\nBook returned successfully!");
        System.out.println("Book: " + selectedBook.getTitle());
    }
}