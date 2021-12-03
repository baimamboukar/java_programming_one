/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS TO PROJECT THE NUMBER OF POPULATION IN THE NEXT FIVE YEARS BASED ON NUMBER OF DEATHS, BIRTHS, IMMIGRANTS AND ACTUAL POPULATION
 */

package com.baimamboukar.java.src;

public class Population {
    public static void main(String[] args) {
        int currentPopulation = 312_032_486;
        int yearInSeconds = 365 * 24 * 60 * 60;

        int totalBirthPerYear = yearInSeconds / 7;
        int totalDeathPerYear = yearInSeconds / 13;
        int totalImmigrantPerYear = yearInSeconds / 45;

        int populationIncreasePerYear = totalBirthPerYear + totalImmigrantPerYear - totalDeathPerYear;
        System.out.println("Population in next five years");
        System.out.println("1st Year: " + (currentPopulation + populationIncreasePerYear * 1));
        System.out.println("2nd Year: " + (currentPopulation + populationIncreasePerYear * 2));
        System.out.println("3rd Year: " + (currentPopulation + populationIncreasePerYear * 3));
        System.out.println("4th Year: " + (currentPopulation + populationIncreasePerYear * 4));
        System.out.println("5th Year: " + (currentPopulation + populationIncreasePerYear * 5));

    }
}
