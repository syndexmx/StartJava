package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.controller.UI;

public class BookCaseApp {

    public static void main(String[] args) {
        UI ui = new UI();
        while (true) {
            ui.processMenu();
        }
    }
}
