/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS USED TO SUMMATION OF NUMBERS
 */

package com.baimamboukar.java.src;

public class Summation {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the serie is: " + sum);
    }
}
