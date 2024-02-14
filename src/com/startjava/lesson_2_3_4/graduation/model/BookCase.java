package com.startjava.lesson_2_3_4.graduation.model;

import java.util.Arrays;

public class BookCase {

    private final int capacity;
    private int countBooks;
    private Book[] books;
    private int maxInfoLength;

    public BookCase(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxInfoLength() {
        return maxInfoLength;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void add(Book book) {
        if (countBooks < capacity) {
            books[countBooks++] = book;
            if (book.getInfoLength() > maxInfoLength) {
                maxInfoLength = book.getInfoLength();
            }
        } else {
            System.out.println("Шкаф полон!");
        }
    }

    public void findByTitle(String title) {
        for (int i = 0; i < countBooks; i++) {
            Book book = books[i];
            if (title.equalsIgnoreCase(book.getTitle())) {
                System.out.println("Найдена книга: " + book);
            }
        }
    }

    public void deleteByTitle(String title) {
        int index = -1;
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            Book book = books[index];
            System.arraycopy(books, index + 1, books, index, countBooks - index - 1);
            System.out.println("Книга " + book + " удалена!");
            countBooks--;
            if (book.getInfoLength() == maxInfoLength) {
                recalculateMaxInfoLength();
            }
        }
    }

    public void clear() {
        countBooks = 0;
        maxInfoLength = 0;
        Arrays.fill(books, 0, capacity - 1, null);
    }

    private void recalculateMaxInfoLength() {
        for (int i = 0; i < countBooks; i++) {
            maxInfoLength = Math.max(maxInfoLength, books[i].getInfoLength());
        }
    }
}
