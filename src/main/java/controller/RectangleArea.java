package controller;

import dao.RectangleDAO;
import service.IAreaData;

import java.util.Scanner;

public class RectangleArea implements IAreaData {
    RectangleDAO rectangleDAO = new RectangleDAO();
    Scanner sc = new Scanner(System.in);
    public void setRectangleData() {

        System.out.println("Enter the Rectangle Width : ");
        rectangleDAO.setWidth(sc.nextDouble());
        System.out.println("Enter the Rectangle Length : ");
        rectangleDAO.setLength(sc.nextDouble());
    }

    @Override
    public double calculateArea() {
        return rectangleDAO.getWidth() * rectangleDAO.getLength();
    }
}
