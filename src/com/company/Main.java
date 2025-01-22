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
        numbers.removeAt(6);
        System.out.println(numbers.indexOf(60));
        numbers.print();

        System.out.println("\n\n\n");

        Array numbers1 = new Array(3);
        numbers1.insert(1);
        numbers1.insert(2);
        System.out.println(numbers1.indexOf(2));
        numbers1.removeAt(0);
        numbers1.print();

    }
}
