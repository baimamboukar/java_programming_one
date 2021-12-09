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
 * DESCRIPTION: This program is a simple program that calculates the cost of driving
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class DrivingCost {

    public static void main(String[] args) {
        System.out.print("Enter the distance to drive: ");
        double distance = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
        double mpg = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the price per gallon: ");
        double price = Double.parseDouble(System.console().readLine());
        double cost = distance / mpg * price;
        System.out.println("The cost of driving is $" + cost);
    }
}
