package com.example;

import com.example.Console;

public class App {
    private final Console console;

    public App(Console console) {
        this.console = console;
    }

    public void greet() {
        console.print("Hello!");
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
