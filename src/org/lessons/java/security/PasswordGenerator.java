package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Vars
        String name;
        String surname;
        String favColor;
        Byte day;
        Byte month;
        short year;

        String pwd;

        // New Scanner instance
        Scanner input = new Scanner(System.in);

        // Get Input from User
        System.out.println("Insert Name...");
        name = input.nextLine();

        System.out.println("Insert Surname...");
        surname = input.nextLine();

        System.out.println("Insert favourite color...");
        favColor = input.nextLine();

        System.out.println("Insert birth day...");
        day = input.nextByte();

        System.out.println("Insert birth month...");
        month = input.nextByte();

        System.out.println("Insert birth year...");
        year = input.nextShort();

        pwd = String.format("%s-%s-%s-%d", name, surname, favColor, day + month + year);

        // DEBUG
        System.out.println(name + " " + surname + " " + favColor + " " + day + " " + month + " " + year);

        // Print Pwd
        System.out.println("Ecco la tua password: " + pwd);
    }
}
