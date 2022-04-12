package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;

    void getStudent() {
        System.out.println("Enter The Name : ");
        name = scanner.next();
        System.out.println("Enter the ID : ");
        id = scanner.nextInt();

    }
}
class Internal extends Student {
    int im1;
    int im2;
    void getInternal(){
        System.out.println("Enter IM1 MARKS : ");
        im1 = scanner.nextInt();
        System.out.println("Enter IM2 MARKS : ");
        im2 = scanner.nextInt();
    }
}




