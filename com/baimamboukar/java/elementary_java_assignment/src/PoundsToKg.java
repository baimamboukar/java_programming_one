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
 * DESCRIPTION: This program converts pounds to kilograms
 */

package com.baimamboukar.java.elementary_java_assignment.src;

public class PoundsToKg {

    public static void main(String[] args) {
        // declare variables
        double pounds;
        double kilograms;

        // prompt user to enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        pounds = Double.parseDouble(System.console().readLine());

        // convert pounds to kilograms
        kilograms = pounds * 0.454;

        // display the result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}