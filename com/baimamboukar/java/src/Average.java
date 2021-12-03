/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:02:15
 * @modify date 2021-12-03 18:02:16
 * @desc : THIS PROGRAM IS USED TO CALCULATE THE AVERAGE OF SPEED IN MILES PER HOUR
 */

package com.baimamboukar.java.src;

public class Average {
    public static void main(String[] args) {
        double runningDistanceInMiles = 14 / 1.6;
        double runningTimeInSeconds = 45 * 60 + 30;
        double runningTimeInHour = runningTimeInSeconds / 3600;
        double average = runningDistanceInMiles / runningTimeInHour;
        System.out.println("The average speed is: " + average + "   miles/hour");
    }

}
