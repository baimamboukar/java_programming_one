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
 * DESCRIPTION: This is a simple financial application
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class FinancialApp {

    public static void main(String[] args) {
        System.out.print("Enter the subtotal: ");
        double subtotal = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the gratuity rate as a decimal: ");
        double gratuityRate = Double.parseDouble(System.console().readLine());
        double gratuity = getGratuity(subtotal, gratuityRate);
        double total = getTotal(subtotal, gratuity);
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }

    public static double getGratuity(double subtotal, double gratuityRate) {
        return subtotal * gratuityRate / 100;
    }

    public static double getTotal(double subtotal, double gratuity) {
        return subtotal + gratuity;
    }
}