package org.example;

public class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }


    public void bookInfo() {
        System.out.println("************Book Info attached below************");
        System.out.println("Title : " +title);
        System.out.println("Author : "+author);
    }
}
