package com.labs.java.io;

import com.labs.java.io.Product;

import java.io.*;
import java.util.Scanner;

public class ProductImportSerializer {
    public static void main(String[] args) {
        String productDetails = "";
        try (Scanner in = new Scanner(new FileReader("./input/products.txt"))) {
            while (in.hasNextLine()) {
                productDetails = in.nextLine();
            }
            System.out.println("product details read from file");

            String[] details = productDetails.split(",");
            int id = Integer.parseInt(details[0]);
            ProductCategory cat = ProductCategory.valueOf(details[1]);
            String desc = details[2];
            double price = Double.parseDouble(details[3]);
            boolean active = Boolean.parseBoolean(details[4]);

            Product obj = new Product(id,cat,desc,price,active);

            FileOutputStream outStream =  new FileOutputStream("./output/product.ser");
            ObjectOutputStream out = new ObjectOutputStream(outStream);
            out.writeObject(obj);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
