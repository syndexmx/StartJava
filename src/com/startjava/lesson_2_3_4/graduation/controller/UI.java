package com.startjava.lesson_2_3_4.graduation.controller;

import com.startjava.lesson_2_3_4.graduation.model.Book;
import com.startjava.lesson_2_3_4.graduation.service.BookCase;

import java.util.Scanner;

public class UI {

    private static final int CAPACITY = 10;
    private BookCase bookCase = new BookCase(CAPACITY);
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        showBookCase();
        showMenu();
        makeChoice();
    }

    private void showBookCase() {
        Book[] allBooks = bookCase.getAllBooks();
        int size = allBooks.length;
        if (size > 0) {
            System.out.print("В шкафу книг : " + size + ",");
            System.out.println(" свободно полок : " + (bookCase.getCapacity() - size));
            int length = bookCase.getMaxInfoLength();
            for (int i = 0; i < size; i++) {
                System.out.print("|");
                Book book = allBooks[i];
                System.out.print(book + " ".repeat(length - book.getInfoLength()));
                System.out.println("|");
                System.out.println("|" + "-".repeat(length) + "|");
            }
            System.out.println("|" + " ".repeat(length) + "|");
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private void showMenu() {
        System.out.println("*** Меню ***");
        System.out.println("""
                0. Завершить
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф""");
    }

    private void makeChoice() {
        System.out.print("Сделайте ваш выбор: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0" -> System.exit(0);
            case "1" -> addBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> bookCase.clear();
            default -> System.out.println("Некорректная команда!");
        }
    }

    private void addBook() {
        System.out.println("*** Добавление книги ***");
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        String title = enterBookTitle();
        System.out.print("Введите год: ");
        String yearInput = "";
        while (!yearInput.matches("\\d\\d\\d\\d")) {
            yearInput = scanner.nextLine();
        }
        int year = Integer.parseInt(yearInput);
        Book newBook = new Book(author, title, year);
        bookCase.add(newBook);
    }

    private String enterBookTitle() {
        System.out.print("Введите название: ");
        return scanner.nextLine();
    }

    private void deleteBook() {
        System.out.println("*** Удаление книги ***");
        String title = enterBookTitle();
        bookCase.deleteByTitle(title);
    }

    private void findBook() {
        System.out.println("*** Поиск книги ***");
        String title = enterBookTitle();
        Book book = bookCase.findByTitle(title);
        if (book!=null) {
            System.out.println("Найдена книга: " + book);
        } else {
            System.out.println("Запрошенной книги не найдено!");
        }
    }
}
