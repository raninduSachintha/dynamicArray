package com.company;

public class Main {

    public static void main(String[] args) {

        Array numbers = new Array(5);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.removeAt(5);
        System.out.println(numbers.indexOf(50));
        numbers.print();

        System.out.println("\n\n\n");

        Array numbers1 = new Array(3);
        numbers1.insert(10);
        numbers1.insert(20);
        numbers1.insert(30);
        numbers1.insert(40);
        numbers1.insert(50);
        numbers1.removeAt(4);
        System.out.println(numbers1.indexOf(100));
        numbers1.print();

    }
}
