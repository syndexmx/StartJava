package com.startjava.lesson_2_3_4.graduation.service;

import com.startjava.lesson_2_3_4.graduation.model.Book;

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

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < countBooks; i++) {
            Book book = books[i];
            if (title.equalsIgnoreCase(book.getTitle())) {
                return book;
            }
        }
        return null;
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

    private void recalculateMaxInfoLength() {
        for (int i = 0; i < countBooks; i++) {
            maxInfoLength = Math.max(maxInfoLength, books[i].getInfoLength());
        }
    }

    public void clear() {
        countBooks = 0;
        maxInfoLength = 0;
        Arrays.fill(books, 0, capacity, null);
    }
}
