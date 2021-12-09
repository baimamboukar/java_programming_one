package com.baimamboukar.java.elementary_java_assignment.src;

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
 * DESCRIPTION: This program is a simple java program that calculates the
 * accelaration
 */

public class Acceleration {

    public static void main(String[] args) {
        System.out.print("Enter the starting velocity in meters/second: ");
        double v0 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the ending velocity in meters/second: ");
        double v1 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the time span in seconds: ");
        double t = Double.parseDouble(System.console().readLine());
        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is " + a + " meters/second^2");
    }
}
