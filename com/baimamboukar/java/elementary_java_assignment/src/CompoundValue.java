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
 * DESCRIPTION: This program is a compound value class that stores
 */
package com.baimamboukar.java.elementary_java_assignment.src;
public class CompoundValue {

    public static void main(String[] args) {
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = Double.parseDouble(System.console().readLine());
        double accountValue = 0;
        for (int i = 1; i <= 6; i++) {
            accountValue = accountValue + monthlySaving;
            accountValue = accountValue * 1.00417;
        }
        System.out.println("After the sixth month, the account value is $" + accountValue);
    }
}