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
 * DESCRIPTION: This program is a simple investment calculator
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class FutureInvestValue {

    public static void main(String[] args) {
        System.out.print("Enter investment amount: ");
        double investment = Double.parseDouble(System.console().readLine());
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = Double.parseDouble(System.console().readLine());
        System.out.print("Enter number of years: ");
        int years = Integer.parseInt(System.console().readLine());
        double futureInvestment = investment * Math.pow(1 + interestRate / 100, years);
        System.out.println("Accumulated value is: $" + futureInvestment);
    }
}