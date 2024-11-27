package com.labs.java.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCardGenricsDemo {
    private List<Comparable<?>> nos = new ArrayList<>();
    WildCardGenricsDemo() {
        nos.add(1);
        nos.add(2);
        nos.add(3);
        nos.add("java");
    }
    public void printList(List<Comparable<?>> list) {
        for(Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        WildCardGenricsDemo demo = new WildCardGenricsDemo();
        demo.printList(demo.nos);
    }
}
