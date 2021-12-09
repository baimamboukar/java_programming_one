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
 * DESCRIPTION: This is a simple monetary units calculator.
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class MonetaryUnits {

    public static void main(String[] args) {
        System.out.println("Enter the amount to convert: ");
        int input = Integer.parseInt(System.console().readLine());

        int dollars = input / 100;
        int cents = input % 100;
        System.out.println("The change is " + dollars + " dollars and " + cents + " cents");
    }
}