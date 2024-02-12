package com.startjava.lesson_2_3_4.graduation.model;

public class BookCase {

    private int capacity;
    private int size;
    private Book[] books;
    private int maxInfoLength;

    public BookCase(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public int getSize() {
        return size;
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

    public void addBook(Book book) {
        if (size < capacity) {
            books[size++] = book;
            if (book.getInfoLength() > maxInfoLength) {
                maxInfoLength = book.getInfoLength();
            }
        } else {
            System.out.println("Шкаф полон!");
        }
    }

    public void findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (title.equalsIgnoreCase(book.getTitle())) {
                System.out.println("Найдена книга: " + book);
            }
        }
    }

    public void deleteBookByTitle(String title) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            Book book = books[index];
            System.arraycopy(books, index + 1, books, index, size - index - 1);
            System.out.println("Книга " + book + " удалена!");
            size--;
            if (book.getInfoLength() == maxInfoLength) {
                recalculateMaxInfoLength();
            }
        }
    }

    public void clear() {
        size = 0;
        maxInfoLength = 0;
    }

    private void recalculateMaxInfoLength() {
        for (int i = 0; i < size; i++) {
            maxInfoLength = Math.max(maxInfoLength, books[i].getInfoLength());
        }
    }
}
