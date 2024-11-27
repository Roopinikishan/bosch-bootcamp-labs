package com.labs.java.fp;

public class CalcOOP {
    private int a;
    private int b;

    public CalcOOP(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        int result = a+b;
        return result;
    }

    public int substract() {
        int result = a-b;
        return result;
    }

    public int multiply() {
        int result  = a*b;
        return result;
    }
}
