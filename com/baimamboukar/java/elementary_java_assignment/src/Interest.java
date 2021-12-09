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
 * DESCRIPTION: This is a simple interest calculator.
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class Interest {

    public static void main(String[] args) {
        // declare variables
        double balance;
        double interestRate;
        double interest;

        // read the balance and the interest rate
        System.out.print("Enter the balance: ");
        balance = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the interest rate: ");
        interestRate = Double.parseDouble(System.console().readLine());

        // calculate the interest
        interest = balance * (interestRate / 1200);

        // print the interest
        System.out.println("The interest is " + interest);
    }
}
