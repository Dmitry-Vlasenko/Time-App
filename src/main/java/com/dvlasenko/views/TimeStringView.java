package com.dvlasenko.views;


import com.dvlasenko.Models.TimeConverter;

import java.util.Scanner;

public class TimeStringView {

    public void timeToString(Scanner scanner) {
        System.out.print("Input data must be seconds string. Example 123456: \n");
        long inputSeconds = Long.parseLong(scanner.nextLine());
        TimeConverter converter = new TimeConverter();
        System.out.println(converter.secondsToTimeString(inputSeconds));
    }

}
