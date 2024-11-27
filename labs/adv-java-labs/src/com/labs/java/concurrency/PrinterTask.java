package com.labs.java.concurrency;

import java.util.concurrent.Callable;

public class PrinterTask implements Callable<String> {
    public String call() {
        System.out.println(Thread.currentThread().getName() + "processing..");
        return "Hello Java";
    }
}
