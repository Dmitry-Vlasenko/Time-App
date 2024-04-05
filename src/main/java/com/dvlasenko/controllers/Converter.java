package com.dvlasenko.controllers;

import com.dvlasenko.views.TimeStringView;

import java.util.Scanner;

public class Converter {

    public void controllerProcessing() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            String menu = """ 
                    --------------
                    Choice action:
                    --------------
                    Choice 1 => convert seconds to time string
                    Choice 2 => stop and exit
                    """;
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();
            TimeStringView timeString = new TimeStringView();
            switch (choice) {
                case "1":
                    timeString.timeToString(scanner);
                    break;
                case "2":
                    running = false;
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}