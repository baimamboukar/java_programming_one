
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
 * DESCRIPTION: This program display current time according to the time zone
 */
package com.baimamboukar.java.elementary_java_assignment.src;
import java.util.Date;

public class CurrentTime {

    public static void main(String[] args) {

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = Integer.parseInt(System.console().readLine());
        System.out.println("The current time is " + new Date(System.currentTimeMillis() + offset * 60 * 60 * 1000));
    }
}
