package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {

        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(reversed);
    }
}

