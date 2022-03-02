package com.revature.time;
import  java.time.LocalTime;

public class TimeKeeper {
    public static void main(String[] args) {
        LocalTime currentTime = java.time.LocalTime.now();
        int hour = currentTime.getHour();
        String AMPM;
        if(hour > 11){
            AMPM = "PM";
        } else {
            AMPM = "AM";
        }
        hour %= 12;
        if(hour == 0){
            hour = 12;
        }

        int min = currentTime.getMinute();

        System.out.println(hour + ":" + min + " " + AMPM);
    }
}
