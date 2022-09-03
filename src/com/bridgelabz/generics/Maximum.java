package com.bridgelabz.generics;

public class Maximum<T> {T a;
    T b;
    T c;

    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String[] args) {

        System.out.println("Maximum Integer -> " +findMax(43,23,33));
        System.out.println("Maximum Float -> " +findMax(19.5F,13.4F,18.8F));
        System.out.println("Maximum String -> " +findMax("Apple","Banana","PineApple"));
    }

    public static <T extends Comparable <T>> T findMax(T a,T b, T c){
        T max = a;
        if(b.compareTo(max) > 0)
            max = b;
        if(c.compareTo(max) > 0)
            max = c;
        return max;
    }
}