package com.labs.java.fp;

import java.util.Arrays;
import java.util.function.*;

public class LambdaExpEx {
    public static void main(String[] args) {
        //check sum of 2 numbers even or odd(if even true,odd false)
        BiPredicate<Integer, Integer> evenOrOdd = (a, b) -> (a + b) > 0;
        System.out.println(evenOrOdd.test(10, 20));

        //Check if a number is prime
        Predicate<Integer> isPrime = (a) -> {
            for (int i = 2; i <= a / 2; ++i) {
                if ((a % i) == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(17));

        //Get an array of integer and return sum of squares of all the even numbers of the array
        Function<Integer[],Integer> evenSquaresSum = (array)->{
            int len = array.length;
            int result = 0;
            for(int i = 0;i<len;i++) {
                if ((i % 2) == 0) {
                    result = result + (array[i])^2;
                }
            }
            return result;
        };
        Integer[] a = {1,2,3};
        System.out.println(evenSquaresSum.apply(a));


        //Compare 2 strings and return 0 if they are equal,a positive value if the first string id lexicographically greater,
        //and a negative value otherwise
        BiFunction<String,String,Integer> strComp = (str1,str2)-> str1.compareTo(str2);
        System.out.println(strComp.apply("hello","hi"));


        //Sort an array of Strings in acsending order of their length and print the sorted array
        Supplier<String[]> strArr = ()->new String[]{"Hello","Bosch","Welcome"};
        Consumer<String[]> strConsumer = (arr)->{
            for (int i=0;i < arr.length;i++) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[i].length() > arr[j].length()) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(String s :arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        };

    }

}
