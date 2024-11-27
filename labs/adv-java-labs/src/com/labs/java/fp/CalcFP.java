package com.labs.java.fp;

public class CalcFP {
//    public int add(int a,int b) {
//        return a+b;
//    }
//
//    public int subtract(int a,int b) {
//        return a-b;
//    }
//
//    public int multiply(int a,int b) {
//        return a*b;
//    }

    public int compute(int a, int b, Operation operation) {
        return operation.compute(a,b);
    }
}
