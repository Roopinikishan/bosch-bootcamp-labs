package com.labs.java.fp;

import java.util.function.BiFunction;

public class CalcMain {
    public static void main(String[] args) {
//        CalcOOP calc = new CalcOOP(10,5);
//        System.out.println("Addition : "+ calc.add());
//        System.out.println("Substraction : "+ calc.substract());
//        System.out.println("Multiply : "+ calc.multiply());

//        CalcFP calcfp = new CalcFP();
//        System.out.println("Addition : "+ calcfp.add(10,5));
//        System.out.println("Substraction : "+ calcfp.subtract(20,10));
//        System.out.println("Multiply : "+ calcfp.multiply(50,5));

        //Annonymus inner class
        Operation addition = new Operation() {
            @Override
            public int compute(int a,int b) {
                return a+b;
            }
        };

        //Lambda expression
        Operation multiplication = (int a,int b)-> {
            return a*b;
        };

        Operation division = (int a, int b) -> a/b;

        BiFunction<Integer,Integer,Integer> newSub = (a,b)-> a-b;

        CalcFP calcfp = new CalcFP();
        System.out.println("Addition = "+calcfp.compute(10,5,addition));
        System.out.println("Multiply = "+calcfp.compute(10,5,multiplication));
        System.out.println("Division = "+calcfp.compute(10,5,division));
        System.out.println("Subtraction = "+newSub.apply(10,5));
    }
}
