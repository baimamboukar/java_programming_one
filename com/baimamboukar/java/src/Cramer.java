/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS TO SOLVE A SYSTEM OF EQUATION USING CRAMER METHOD
 */

package com.baimamboukar.java.src;

import java.util.Scanner;

public class Cramer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] parameters = takeParameters();
        showEquation(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);
        solveEquation(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5]);

        solveDefaultEquation();

    }

    public static double[] takeParameters() {
        System.out.println("Enter the parameters a b c and d numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        return new double[] { a, b, c, d, e, f };
    }

    public static void showEquation(double a, double b, double c, double d, double e, double f) {
        System.out.println("The equation you entered is: \n " + a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);
    }

    public static void solveEquation(double a, double b, double c, double d, double e, double f) {
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("The solution is: " + x + " and " + y);
    }

    public static void solveDefaultEquation() {
        double[] defaultParameters = { 3.4, 50.2, 2.1, .55, 44.5, 5.9 };
        System.out.println("The default equation is: \n " + defaultParameters[0] + "x + " + defaultParameters[1]
                + "y = " + defaultParameters[4]);
        System.out.println(defaultParameters[2] + "x + " + defaultParameters[3] + "y = " + defaultParameters[5]);
        solveEquation(defaultParameters[0], defaultParameters[1], defaultParameters[2], defaultParameters[3],
                defaultParameters[4], defaultParameters[5]);
    }

}
