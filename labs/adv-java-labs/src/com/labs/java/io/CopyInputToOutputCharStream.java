package com.labs.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class CopyInputToOutputCharStream {
    public static void main(String[] args) {
        try(FileReader readerObj = new FileReader("src/com/labs/java/io/input.txt");
            FileWriter writeObj = new FileWriter("src/com/labs/java/io/output.txt");) {
            //*********Read and write character by character*********
//            int val = readerObj.read();
//            while (val != -1) {
//                writeObj.write(val);
//                val = readerObj.read();
//            }

            //********To transfer all content from one file to other*********
            //readerObj.transferTo(writeObj);

            //*********** To manipulate and write data to out file
            int val = readerObj.read();
            while (val != -1) {
                writeObj.write(String.valueOf((char)val).toUpperCase());
                val = readerObj.read();
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
