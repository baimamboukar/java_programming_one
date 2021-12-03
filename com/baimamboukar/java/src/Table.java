/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS USED TO DISPLAY A POWER TABLE
 */

package com.baimamboukar.java.src;

public class Table {

    public static void main(String[] args) {
        System.out.println("POWER TABLE");
        System.out.println("................................");
        System.out.println("a           a^2          a^3");
        System.out.println("................................");
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + "          " + i * i + "          " + i * i * i);
        }
        System.out.println("................................");
    }
}
