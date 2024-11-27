package com.labs.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("src/com/labs/java/io/input.txt")) {
            System.out.println(in);

            int val = in.read();
            while (val != -1) {
                System.out.println((char)val);
                val = in.read();
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //File out stream usage
        System.out.println("writing to a file");
        try(FileOutputStream outfile = new FileOutputStream("src/com/labs/java/io/input.txt",true)){

        String message = "to java IO";
        byte[] byteArray = message.getBytes();
        outfile.write(byteArray);
        outfile.write('\n');
        //writing byte by byte
//            for(byte singleByte:byteArray) {
//                outfile.write(singleByte);
//            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
