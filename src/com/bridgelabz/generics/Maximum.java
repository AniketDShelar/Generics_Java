package com.bridgelabz.generics;

public class Maximum {
    public static void main(String[] args) {
        findMaxFloat(9.7f, 6.8f, 7.9f);
    }

    public static Float findMaxFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("First Number -> " + a);
        System.out.println("Second Number -> " + b);
        System.out.println("Third Number -> " + c);
        System.out.println("Maximum Value is -> " + max);
        return max;
    }
}