package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();
        String full = fullName.trim();

        String[] name = full.split(" ");
        String first = name[0];
        String middle, last;

        if (name.length == 3){
          middle = name[1];
          last = name[2];
        } else {
            middle = "(none)";
            last = name[1];
        }

        System.out.println("First name: " + first);
        System.out.println("Middle name: " + middle);
        System.out.println("Last name: " + last);

    }
}
