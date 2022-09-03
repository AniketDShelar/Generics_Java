package com.bridgelabz.generics;

public class Maximum {
    public static Integer findMaxInteger(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("First Number -> " + a);
        System.out.println("Second Number -> " + b);
        System.out.println("Third Number -> " + c);
        System.out.println("Maximum Number -> " + max);
        return max;
    }

    public static void main(String[] args) {
        Maximum.findMaxInteger(24, 19, 15);
    }
}