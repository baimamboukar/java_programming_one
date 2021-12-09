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
 * DESCRIPTION: This is a program that calculates the wind chill temperature
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class WindChillTemp {

    public static void main(String[] args) {
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temp = Double.parseDouble(System.console().readLine());
        System.out.println("Enter the wind speed in miles per hour: ");
        double speed = Double.parseDouble(System.console().readLine());
        double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * temp * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + windChill);
    }
}