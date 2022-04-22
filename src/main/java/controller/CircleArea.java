package controller;

import dao.CircleDAO;
import service.IAreaData;

import java.util.Scanner;

public class CircleArea implements IAreaData {
    CircleDAO circleDAO = new CircleDAO();
    Scanner sc = new Scanner(System.in);

    public void setCircleData() {
        System.out.println("Enter the Circle Radius : ");
        circleDAO.setRadius(sc.nextDouble());

    }

    @Override
    public double calculateArea() {
        return pi * circleDAO.getRadius() * circleDAO.getRadius();
    }
}
