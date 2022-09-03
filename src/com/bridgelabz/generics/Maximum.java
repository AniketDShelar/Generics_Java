package com.bridgelabz.generics;

public class Maximum<T extends Comparable<T>> {
    public static void main(String[] args) {
    Maximum.<Integer>findMaximum(6, 7, 8, 9, 54, 76, 43);

    Maximum.<Float>findMaximum(5.6f, 6.7f, 7.8f, 8.9f);

    Maximum.<String>findMaximum("Mango", "orange", "Banana", "Apple", "Grapes");
}
    public static <T extends Comparable <T>> T findMaximum(T... value) {
        T max = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(max) > 0) {
                max = value[i];
            }
        }
        System.out.println("given values are : ");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        printMax(max);
        return max;
    }
    private static<T> void printMax(T max) {
        System.out.println("Maximum value -> " +max);
    }
}