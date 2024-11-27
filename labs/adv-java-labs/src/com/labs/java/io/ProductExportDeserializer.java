package com.labs.java.io;

import com.labs.java.streams.Product;

import java.io.*;

public class ProductExportDeserializer {
    public static void main(String[] args) {
        Product newProduct = deserailizeProduct();
        writeProductDetailsToFile(newProduct);
    }

    public static Product deserailizeProduct() {
        Product product = null;
        try (FileInputStream in = new FileInputStream("./output/product.ser")) {

            ObjectInputStream objIn = new ObjectInputStream(in);
            product = (Product) objIn.readObject();
            System.out.println("Desriazed product object");

        }catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return product;
    }

    public static void writeProductDetailsToFile(Product product) {
        File file = new File("./output/product.ser");

        try(FileOutputStream outStream =  new FileOutputStream("./output/deserialized.txt")) {
            ObjectOutputStream out = new ObjectOutputStream(outStream);
            out.writeObject(product);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
