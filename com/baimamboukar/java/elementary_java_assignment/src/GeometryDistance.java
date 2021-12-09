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
 * DESCRIPTION: This is a simple program that calculates the distance between
 * two points.
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class GeometryDistance {

    public static void main(String[] args) {
        System.out.println("Enter the x1, y1 coordinates: ");
        double x1 = Double.parseDouble(System.console().readLine());
        double y1 = Double.parseDouble(System.console().readLine());
        System.out.println("Enter x2, y2 coordinates: ");
        double x2 = Double.parseDouble(System.console().readLine());
        double y2 = Double.parseDouble(System.console().readLine());
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance);
    }
}
