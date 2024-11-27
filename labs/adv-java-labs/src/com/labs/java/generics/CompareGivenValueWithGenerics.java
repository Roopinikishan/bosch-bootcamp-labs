package com.labs.java.generics;

public class CompareGivenValueWithGenerics {

    public static void compareValues(Integer a,Integer b) {
        if(a>b) {
            System.out.println(a + "is greater than" + b);
        }
        else if(a<b) {
            System.out.println(a + "is less than" + b);
        }
        else {
            System.out.println("Both are same");
        }
    }
}
