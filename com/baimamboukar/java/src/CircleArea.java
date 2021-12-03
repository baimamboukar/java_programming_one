/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS USED TO CALCULATE THE AREA AND PERIMETER OF A CIRCLE
 */

package com.baimamboukar.java.src;

public class CircleArea {
    public static void main(String[] args) {
        double radius = 5.5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area of circle with radius " + radius + " is " + area);
        System.out.println(
                "Perimeter of circle with radius " + perimeter);

    }
}
