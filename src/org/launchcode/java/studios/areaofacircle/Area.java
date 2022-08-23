package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double area;
    double radius;

     System.out.print("Enter radius: ");
     radius = input.nextDouble();
     if (radius < 0 || radius.isNaN()) {

     }
     area =Circle.getArea(radius);
     System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
