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
 * DESCRIPTION: This is a program that converts celcius to farenheit
 */

public class CelciusToFarenheit {
    // convert celcius to farenheit
    public static void main(String[] args) {
        double celcius = 0;
        double farenheit = 0;
        System.out.println("Enter a degree in Celcius: ");
        celcius = Double.parseDouble(System.console().readLine());
        farenheit = convertCelciusToFarenheit(celcius);
        System.out.println(celcius + "  Celcius is " + farenheit + " fahrenheit");
    }

    public static double convertCelciusToFarenheit(double celcius) {
        double farenheit = 0;
        farenheit = (celcius * 9 / 5) + 32;
        return farenheit;
    }
}