package org.example;

import org.example.library.Book;
import org.example.library.BookRepository;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookRepository repository = new BookRepository();

        boolean running = true;

        while (running) {

            System.out.println("\n=================================");
            System.out.println("     LIBRARY MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n--- Add Book ---");

                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    Book newBook = new Book(
                            id,
                            title,
                            author,
                            price
                    );

                    repository.addBook(newBook);

                    break;

                case 2:

                    System.out.println("\n--- All Books ---");

                    List<Book> books = repository.getAllBooks();

                    if (books.isEmpty()) {
                        System.out.println("No books found!");
                    } else {
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    }

                    break;

                case 3:

                    System.out.println("\n--- Search Book ---");

                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();

                    Book foundBook =
                            repository.searchBookByTitle(searchTitle);

                    if (foundBook != null) {
                        System.out.println("\n--- Book Found ---");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("\nBook not found!");
                    }

                    break;

                case 4:

                    System.out.println("\n--- Update Book ---");

                    System.out.print("Enter Book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();

                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();

                    Book updatedBook = new Book(
                            updateId,
                            newTitle,
                            newAuthor,
                            newPrice
                    );

                    repository.updateBook(updatedBook);

                    break;

                case 5:

                    System.out.println("\n--- Delete Book ---");

                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();

                    repository.deleteBook(deleteId);

                    break;

                case 6:

                    System.out.println("\nThank you for using Library Management System!");
                    running = false;

                    break;

                default:

                    System.out.println("\nInvalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}