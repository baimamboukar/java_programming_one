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
 * DESCRIPTION: This is a program projects population number in n years
 */
package com.baimamboukar.java.elementary_java_assignment.src;

public class Population {
    public static void main(String[] args) {
        int currentPopulation = 312_032_486;
        int yearInSeconds = 365 * 24 * 60 * 60;

        int totalBirthPerYear = yearInSeconds / 7;
        int totalDeathPerYear = yearInSeconds / 13;
        int totalImmigrantPerYear = yearInSeconds / 45;
        System.out.println("Enter the number of years:");
        int numberOfYears = Integer.parseInt(System.console().readLine());

        int populationIncreasePerYear = totalBirthPerYear + totalImmigrantPerYear - totalDeathPerYear;
        System.out.println(
                "Population in " + numberOfYears + " years: "
                        + (currentPopulation + populationIncreasePerYear * numberOfYears));

    }
}
