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
 * DESCRIPTION: This is a program that read an integer and print the sum of its
 * digits.
 */

package com.baimamboukar.java.elementary_java_assignment.src;

public class SumDigitsInInteger {

    public static void main(String[] args) {

        System.out.println("Enter an integer between 0 and 1000");
        int number = Integer.parseInt(System.console().readLine());
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of all digits in the integer is " + sum);
    }
}