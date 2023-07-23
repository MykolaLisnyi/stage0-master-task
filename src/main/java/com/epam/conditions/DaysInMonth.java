package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )) {
            daysInMonth[1] = 29;
        }

        System.out.println(daysInMonth[month - 1]);
    }
}