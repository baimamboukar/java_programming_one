/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS USED TO CALCULATE THE AREA AND PERIMETER OF A RECTANGLE
 */

package com.baimamboukar.java.src;

public class ReactangleArea {
    public static void main(String[] args) {
        // perimeter and area of a rectangle with given height and width
        double width = 4.5, height = 7.9;
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area of the rectnagle is " + area);
        System.out.println(
                "Perimeter of rectangle is " + perimeter);
    }
}
