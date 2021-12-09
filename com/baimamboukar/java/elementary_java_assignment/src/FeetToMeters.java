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
 * DESCRIPTION: This is a program that converts feet to meters.
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class FeetToMeters {

    public static void main(String[] args) {
        // declare variables
        double feet, meters;

        // prompt user for input
        System.out.print("Enter a distance in feet: ");
        feet = Double.parseDouble(System.console().readLine());

        // convert feet to meters
        meters = feet * 0.305;

        // display result
        System.out.println(feet + " feet is " + meters + " meters.");
    }
}
