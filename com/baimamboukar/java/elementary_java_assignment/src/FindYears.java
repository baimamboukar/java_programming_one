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
package com.baimamboukar.java.elementary_java_assignment.src;
public class FindYears {

    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        long minutes = Integer.parseInt(System.console().readLine());
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}