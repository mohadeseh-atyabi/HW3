package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        //ClockDisplay clock = new ClockDisplay(now.getHour(), now.getMinute(), now.getSecond());
        int run , i=0;
        Scanner myObj = new Scanner(System.in);

        /*System.out.println("Current hour: " + now.getHour());
        System.out.println("Current minute: " + now.getMinute());
        System.out.println("Current second: " + now.getSecond());*/

        System.out.println("How many seconds would you like the program run?");
        run = myObj.nextInt();
        ClockDisplay clock = new ClockDisplay(now.getHour(), now.getMinute(), now.getSecond());

        while( i < run  ){
            System.out.println(clock.getTime());
            clock.timeTick();
            i++;
        }
    }
}
