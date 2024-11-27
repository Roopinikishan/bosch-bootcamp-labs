package com.labs.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFilesUsingBufferedReader {
    public static void main(String[] args) {
        try(BufferedReader readerObj = new BufferedReader(new FileReader("src/com/labs/java/io/input.txt"));
            FileWriter writeObj = new FileWriter("src/com/labs/java/io/output.txt");) {
            String line  =  readerObj.readLine();
            while (line != null) {
                writeObj.write(line);
                writeObj.write('\n');
                line  =  readerObj.readLine();
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
