package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void swap(int first, int second) {
        System.out.println( first +" "+ second);

        // Swapping using bitwise XOR
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println(first +" ");
        System.out.println(second);
    }

}
