package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinaryPrinter binaryPrinter = null; // d данном случае создана ссылка которая ни на что не указывает
        binaryPrinter = new BinaryPrinter(12);
        System.out.println("Original size = " + binaryPrinter.getSize());
        binaryPrinter.setSize(16);
        System.out.println("Changed size = " + binaryPrinter.getSize());

        binaryPrinter.printBinary(12);
    }
}
