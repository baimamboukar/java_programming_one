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
 * DESCRIPTION: This is a simple program that calculates the energy
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class Energy {

    public static void main(String[] args) {

        System.out.print("Enter the amount of water in kilograms: ");
        double water = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the initial temperature of the water: ");
        double initialTemp = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the final temperature of the water: ");
        double finalTemp = Double.parseDouble(System.console().readLine());
        double energy = 4184 * (water * (finalTemp - initialTemp));
        System.out.println("The energy needed is " + energy + " joules.");
    }
}
