package com.labs.java.generics;

public class GenericPrinter<T,S> {
    private T someVal;
    private S newVal;

    public void setSomeVal(T someVal,S newVal) {
        this.someVal = someVal;
        this.newVal = newVal;
    }

    public T getSomeVal() {
        return someVal;
    }

    public void printVal() {
        System.out.println(someVal);
        System.out.println(newVal);
    }

}
