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
 * DESCRIPTION: This is a simple program that computes the body mass index (BMI)
 */
package com.baimamboukar.java.elementary_java_assignment.src;
public class ComputeBMI {

    public static void main(String[] args) {
        System.out.print("Enter your weight in pounds: ");
        double weight = Double.parseDouble(System.console().readLine());
        System.out.print("Enter your height in inches: ");
        double height = Double.parseDouble(System.console().readLine());
        double bmi = weight * 703 / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}
