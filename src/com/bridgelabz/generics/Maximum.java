package com.bridgelabz.generics;

public class Maximum {
    public static String findMaxString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("First Number= " + a);
        System.out.println("Second Number= " + b);
        System.out.println("Thrird Number= " + c);
        System.out.println("Maximum Value is= " + max);
        return max;
    }
    public static void main(String[] args) {
        findMaxString("Mango", "orange", "Banana");
    }
}