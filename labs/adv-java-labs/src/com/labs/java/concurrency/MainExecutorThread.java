package com.labs.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutorThread {
    public static void main(String[] args) throws ExecutionException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores available : "+cores);

        //create Thread pool
        ExecutorService es = Executors.newCachedThreadPool();
        System.out.println("executor service : "+es);

        //Create tasks
//        for(int i=0;i<20;i++) {
//            PrinterTask r1 = new PrinterTask();
//            if(i==6||i==4||i==10)
//            {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            es.submit(r1);
//        }
        PrinterTask r2 = new PrinterTask();

        //submit tasks
        Future<String> f = es.submit(r2);
        while (true) {
            if(!f.isDone()){
                System.out.println("waiting....");
            } else {
                try {
                    System.out.println(f.get());
                    break;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //System.out.println("shutting down");
        //es.shutdown();
        //System.out.println("Over...");
    }
}
