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
 * DESCRIPTION: This is a program that calculates the area of a hexagon
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class HexagonArea {

    public static void main(String[] args) {
        System.out.print("Enter the side of a hexagon: ");
        double side = Double.parseDouble(System.console().readLine());
        double area = (3 * Math.sqrt(3)) / 2 * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}