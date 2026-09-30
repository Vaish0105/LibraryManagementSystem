# Library Management System

A beginner-friendly Library Management System built using **Java, MySQL, JDBC, and Maven**.

This project demonstrates Java OOP concepts, Collections, Exception Handling, MySQL database operations, JDBC connectivity, and CRUD operations.

---

## 🚀 Features

- Add a new book
- Display all books
- Search books by title
- Update book details
- Delete books
- Store book information in MySQL
- JDBC database connectivity
- Maven dependency management
- Console-based menu
- Repository layer for database operations
- PreparedStatement for database queries

---

## 🛠️ Technologies Used

- Java 21
- MySQL
- JDBC
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## 📁 Project Structure

```text
LibraryManagementSystem
│
├── src
│   └── main
│       └── java
│           │
│           ├── org.example
│           │   └── Main.java
│           │
│           └── org.example.library
│               ├── Book.java
│               ├── User.java
│               ├── Library.java
│               ├── BookNotFoundException.java
│               ├── DatabaseConnection.java
│               └── BookRepository.java
│
├── pom.xml
└── README.md

📚 Java Concepts Covered

This project combines several Java concepts:

Object-Oriented Programming
Classes and Objects
Encapsulation
Constructors
Getters and Setters
Inheritance
Polymorphism
Abstraction
Collections
ArrayList
List
HashMap
Optional
Streams
Exception Handling
try-catch
Custom Exceptions
Exception messages
Database Programming
JDBC
Connection
PreparedStatement
ResultSet
CRUD operations
🗄️ MySQL Database

Create the database using:

CREATE DATABASE library_management;

USE library_management;

Create the books table:

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    available BOOLEAN DEFAULT TRUE
);
📊 Sample Data
INSERT INTO books (id, title, author, price, available)
VALUES
(1, 'Advanced Java', 'James Gosling', 599.00, TRUE),
(2, 'Clean Code', 'Robert C. Martin', 699.00, TRUE),
(3, 'Atomic Habits', 'James Clear', 599.00, TRUE);
🔌 Database Connection

The project uses JDBC to connect Java with MySQL.

The connection is handled by:

DatabaseConnection.java

Example:

private static final String URL =
        "jdbc:mysql://localhost:3306/library_management";

private static final String USERNAME = "root";

private static final String PASSWORD =
        "YOUR_MYSQL_PASSWORD";

Replace YOUR_MYSQL_PASSWORD with your local MySQL password.

Do not upload your real MySQL password to GitHub.

🏗️ Repository Layer

Database operations are handled by:

BookRepository.java

The repository contains methods for:

Getting all books
Adding books
Searching books
Updating books
Deleting books

Example:

public List<Book> getAllBooks()
public void addBook(Book book)
public Book searchBookByTitle(String title)
public void updateBook(Book book)
public void deleteBook(int bookId)
💻 Console Menu

The application provides a simple console menu:

=================================
     LIBRARY MANAGEMENT SYSTEM
=================================
1. Add Book
2. List Books
3. Search Book
4. Update Book
5. Delete Book
6. Exit
🔄 CRUD Operations

The project demonstrates all four major database operations.

Create

Add a new book to MySQL.

Read

Display and search books from MySQL.

Update

Update the title, author, and price of an existing book.

Delete

Delete a book using its ID.

🔐 PreparedStatement

The project uses PreparedStatement for database queries.

Example:

String sql =
        "SELECT * FROM books WHERE title = ?";

PreparedStatement statement =
        connection.prepareStatement(sql);

statement.setString(1, title);

This keeps database operations structured and helps avoid SQL injection problems.

▶️ How to Run
1. Clone the repository
git clone https://github.com/Vaish0105/LibraryManagementSystem.git
2. Open the project in IntelliJ IDEA

Open the project folder:

LibraryManagementSystem
3. Configure MySQL

Create the database and books table using the SQL commands above.

4. Configure DatabaseConnection

Update:

private static final String PASSWORD =
        "YOUR_MYSQL_PASSWORD";

with your local MySQL password.

5. Run Main.java

Run:

src/main/java/org.example/Main.java
✅ Testing Completed

The following operations have been tested successfully:

MySQL connection
Adding books
Listing books
Searching books
Updating books
Deleting books
Console menu operations
JDBC CRUD operations
🎯 Learning Outcomes

Through this project, I practiced:

Java OOP
Collections
Streams
Optional
Exception Handling
JDBC
MySQL
CRUD operations
Maven
Git and GitHub
Repository pattern
Console application development
🚀 Future Improvements

The project can be extended with:

Spring Boot REST APIs
Spring Data JPA
MySQL integration through Spring Boot
User management
Book issue and return functionality
Authentication
Frontend UI
REST API documentation using Swagger
Docker deployment
👩‍💻 Author

Vaishnavi Agnihotri

Java | MySQL | JDBC | Spring Boot | AI/ML

⭐ This project was created as part of my Java and Spring Boot learning journey.


After pasting, press **Ctrl + S**.

**Don't commit or push yet.** Once you've created and saved `README.md`, tell me **“README created”** and we'll do the Git commit and push together. 🚀