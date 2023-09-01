package com.objects.basics;

public class Book {
	String title;
    String author;
    double price;
    String category;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = checkBookType();
    }

    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    String checkBookType() {
        if (price > 500) {
            return "Premium Book";
        } else {
            return "Standard Book";
        }
    }

}
