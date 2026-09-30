package org.example.library;

public class Book {

    // Book details
    private int id;
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book details
    @Override
    public String toString() {
        return "Book ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Price: ₹" + price +
                ", Available: " + available;
    }
}