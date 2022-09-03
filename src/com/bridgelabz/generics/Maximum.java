package com.bridgelabz.generics;

public class Maximum {
    public static void main(String[] args) {

        System.out.println("Maximum Integer -> " +findMax(15,10,7));
        System.out.println("Maximum Float -> " +findMax(9.5F,3.4F,8.8F));
        System.out.println("Maximum String -> " +findMax("Apple","Banana","Orange"));
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