package com.labs.java.generics;

public class GenericPrinterWithBoundedParam<T> {
    private T someValue;

    public void setSomeValue(T someValue) {
        this.someValue = someValue;
    }

    public T getSomeValue() {
        return someValue;
    }

    public void printSomeValue() {
        System.out.println(someValue);
    }
}
