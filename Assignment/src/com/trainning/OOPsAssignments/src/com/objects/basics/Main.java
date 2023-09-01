package com.objects.basics;

public class Main {
public static void main(String[] args) {
	Book book1 = new Book("Rabindranath Tagore", "Chetan Bhagat", 550.0);
    Book book2 = new Book("Gitanjali", "Two States", 300.0);

    System.out.println("Book 1 Details:");
    book1.getDetails();
    System.out.println();

    System.out.println("Book 2 Details:");
    book2.getDetails();
}
}
