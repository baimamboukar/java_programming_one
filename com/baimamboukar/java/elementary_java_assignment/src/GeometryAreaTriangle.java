/**
 * COURSE: JAVA PROGRAMMING I | ICT UNIVERSITY | FALL 2021
 * INSTRUCTOR: Eng. DANIEL MOUNE
 * ..................................................................
 * ⚝ NAME: BAIMAM BOUKAR JEAN JACQUES
 * ⚝ MATRIC NO: ICTU20201685
 * ⚝ EMAIL: baimamboukar@gmail.com
 * ⚝ GITHUB: github.com
 * ⚝ LINKEDIN: linkedin.com/in/baimamboukar
 * ..................................................................
 * DESCRIPTION: This is a program that calculates the area of a triangle
 */

package com.baimamboukar.java.elementary_java_assignment.src;

public class GeometryAreaTriangle {

    public static void main(String[] args) {
        System.out.print("Enter x1: ");
        double x1 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter y1: ");
        double y1 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter x2: ");
        double x2 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter y2: ");
        double y2 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter x3: ");
        double x3 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter y3: ");
        double y3 = Double.parseDouble(System.console().readLine());
        double area = 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        System.out.println("The area of the triangle is " + area);
    }
}