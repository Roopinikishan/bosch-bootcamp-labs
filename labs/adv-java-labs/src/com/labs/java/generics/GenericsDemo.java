package com.labs.java.generics;

public class GenericsDemo {

    public static <E extends  Number> void printArray(E[] inputArray) {
        for(E element : inputArray) {
            System.out.printf("%s  ", element);
        }
        System.out.println();
    }

    public static <E extends Comparable<E>> void compareValues(E a,E b) {
        if(a.compareTo(b) >0) {
            System.out.println(a + " is greater than " + b);
        }
        else if(a.compareTo(b) < 0) {
            System.out.println(a + " is less than " + b);
        }
        else {
            System.out.println("Both are same");
        }
    }

    public static void main(String[] args) {
        System.out.println(("Generics Demo"));
//        Integer[] intArray = {1,2,3,4};
//        printArray(intArray);
//
//        Double[] dobArray = {1.4,2.5,3.5,4.6};
//        printArray(dobArray);
//        GenericPrinter<String> printer = new GenericPrinter<>();
//        printer.setSomeVal("testing");
//        printer.printVal();
//
//        GenericPrinterWithBoundedParam<Object> obj1 = new GenericPrinterWithBoundedParam<>();
//        obj1.setSomeValue(3);
//        obj1.printSomeValue();
//        compareValues(3,5);
//        compareValues("javac","java");
        GenericPrinter<String,Integer> printer = new GenericPrinter<>();
        printer.setSomeVal("testing",7);
        printer.printVal();

        //Raw Type -> we have to avoid
//        GenericPrinter printer1 = new GenericPrinter<>();
//        printer1.setSomeVal("testing",7);
//        printer1.printVal();
    }
}
