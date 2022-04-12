package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;
    int perc;

    void getStudent() {
        System.out.println("Enter The Name : ");
        name = scanner.next();
        System.out.println("Enter the ID : ");
        id = scanner.nextInt();

    }
}
class Result extends Student {
    void getperc() {
        System.out.println("Enter the Percentage : ");
        perc = scanner.nextInt();
    }
    void showResult() {
        System.out.println("ID = " + id);
        System.out.println("NAME = " + name);
        System.out.println("PERCENTAGE = "+perc);
    }
}
class Main {
    public static void main(String[] args) {
        Result result = new Result();
        result.getStudent();
        result.getStudent();
        result.showResult();

    }
}


