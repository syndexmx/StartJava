package com.startjava.lesson_2_3_4.graduation.model;

public class Book {

    private String author;
    private String title;
    private int year;
    private int infoLength;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.infoLength = this.toString().length();
    }

    public String getAuthor() {
        return author;
    }

     public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getInfoLength() {
        return infoLength;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + year;
    }
}
