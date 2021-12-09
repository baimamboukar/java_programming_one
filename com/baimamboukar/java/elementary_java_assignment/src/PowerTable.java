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
 * DESCRIPTION: A program that calculates the power table of numbers
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class PowerTable {
    public static void main(String[] args) {
        System.out.println("POWER TABLE");
        System.out.println("................................");
        System.out.println("a           b          pow(a,b)");
        System.out.println("................................");
        for (int i = 1; i <= 5; i++) {
            int j = i + 1;
            System.out.println(i + "          " + j + "          " + Math.pow(i, j));

        }
        System.out.println("................................");
    }

}
