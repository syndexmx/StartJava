package com.startjava.lesson_2_3_4.graduation.controller;

import com.startjava.lesson_2_3_4.graduation.model.Book;
import com.startjava.lesson_2_3_4.graduation.model.BookCase;

import java.util.Scanner;

public class UI {

    private BookCase bookCase = new BookCase(10);
    private Scanner scanner = new Scanner(System.in);

    public void processMenu() {
        showBookCase();
        showMenu();
        makeChoice();
    }

    private void showBookCase() {
        int size = bookCase.getCountBooks();
        if (size > 0) {
            System.out.print("В шкафу книг : " + size + ",");
            System.out.println(" свободно полок : " + (bookCase.getCapacity() - size));
            int length = bookCase.getMaxInfoLength();
            for (int i = 0; i < size; i++) {
                System.out.print("|");
                Book book = bookCase.getBook(i);
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
        System.out.println("0. Завершить");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Найти книгу");
        System.out.println("3. Удалить книгу");
        System.out.println("4. Очистить шкаф");
    }

    private void makeChoice() {
        System.out.print("Сделайте ваш выбор: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0" -> System.exit(0);
            case "1" -> addBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> {
                bookCase.clear();
            }
            default -> System.out.println("Некорректная команда!");
        }
    }

    private void addBook() {
        System.out.println("*** Добавление книги ***");
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите название: ");
        String title = scanner.nextLine();
        System.out.print("Введите год: ");
        String yearInput = "";
        while (!yearInput.matches("\\d\\d\\d\\d")) {
            yearInput = scanner.nextLine();
        }
        int year = Integer.parseInt(yearInput);
        Book newBook = new Book(author, title, year);
        bookCase.add(newBook);
    }

    private void deleteBook() {
        System.out.println("*** Удаление книги ***");
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        bookCase.deleteByTitle(title);
    }

    private void findBook() {
        System.out.println("*** Поиск книги ***");
        System.out.print("Введите название искомой книги: ");
        String title = scanner.nextLine();
        bookCase.findByTitle(title);
    }
}
