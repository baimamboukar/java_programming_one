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
 * DESCRIPTION: This is a program that calculates the runway length
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class RunwayLength {

    public static void main(String[] args) {
        System.out.print("Enter v in meters/second (m/s): ");
        double v = Double.parseDouble(System.console().readLine());
        System.out.print("Enter a in meters/second squared (m/s2): ");
        double a = Double.parseDouble(System.console().readLine());
        double runwayLength = (v * v) / (2 * a);
        System.out.println("The minimum runway length is " + runwayLength + " meters.");
    }
}