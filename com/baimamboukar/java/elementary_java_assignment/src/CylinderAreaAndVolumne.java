
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
 * DESCRIPTION: This program is a simple java program that calculates the area and volume of a cylinder.
 */
package com.baimamboukar.java.elementary_java_assignment.src;

import java.util.Scanner;

public class CylinderAreaAndVolumne {
    public CylinderAreaAndVolumne() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        double volume = getVolume(radius, length);
        double area = getArea(radius);
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);

        input.close();
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getVolume(double radius, double length) {
        return getArea(radius) * length;
    }

}
