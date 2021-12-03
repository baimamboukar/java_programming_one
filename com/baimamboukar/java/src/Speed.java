/**
 * @author BAIMAM BOUKAR JEAN JACQUES
 * @github www.github.com/baimamboukar
 * @twitter:www.twitter.com/Baimamjj
 * @linkedin:linkedin.com/in/baimamboukar
 * @email: baimamboukar@gmail.com
 * @create date 2021-12-03 18:03:59
 * @modify date 2021-12-03 18:03:59
 * @desc : THIS PROGRAM IS CONVERT A DISTANCE FROM MILE PER HOUR/MIN/SECONDS TO KM/H
 */

package com.baimamboukar.java.src;

public class Speed {
    public static void main(String[] args) {
        double distanceInMiles = 24.0;
        double distanceInKilometers = distanceInMiles * 1.6;
        double runningTimeInSeconds = 100 * 60 + 35;
        double runningTimeInHour = runningTimeInSeconds / 3600;
        double averageInKilometersPerHour = distanceInKilometers / runningTimeInHour;
        System.out.println("The average in km/h is " + averageInKilometersPerHour);
    }
}
