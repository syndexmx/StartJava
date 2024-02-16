package com.startjava.lesson_2_3_4.graduation.model;

public class Book {

    private String author;
    private String title;
    
    // год издания
    private int year;
    private int infoLength;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        infoLength = this.toString().length();
    }

     public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return infoLength;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + year;
    }
}
