package controller;

import dao.TriangleDAO;
import service.IAreaData;

import java.util.Scanner;

public class TriangleArea implements IAreaData {
    TriangleDAO triangleDAO = new TriangleDAO();
    Scanner sc = new Scanner(System.in);

    public void setTriangleData() {
        System.out.println("Enter the Triangle Base : ");
        triangleDAO.setBase(sc.nextDouble());
        System.out.println("Enter the Triangle Height : ");
        triangleDAO.setHeight(sc.nextDouble());
    }
    @Override
    public double calculateArea() {
        return half * triangleDAO.getBase() * triangleDAO.getHeight();
    }
}
