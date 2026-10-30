package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for name
        System.out.println("Please enter your name: ");
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        String first = firstName.trim();

        System.out.println();
    }
}
