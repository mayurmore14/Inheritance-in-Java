package model;

import controller.CircleArea;
import controller.RectangleArea;
import controller.TriangleArea;

public class Main {
    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea();
        circleArea.setCircleData();
        System.out.println("Area of Circle : "+circleArea.calculateArea());

        TriangleArea triangleArea = new TriangleArea();
        triangleArea.setTriangleData();
        System.out.println("Area of Triangle : "+triangleArea.calculateArea());

        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.setRectangleData();
        System.out.println("Area of Rectangle : "+rectangleArea.calculateArea());
    }
}
