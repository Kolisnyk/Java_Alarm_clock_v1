package com.company;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Toolkit;

public class Main {

    public static void main (String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the time before the alarm (in minutes)");
        int alarmTime = Integer.parseInt(reader.readLine());
        int alarmTimeInMinutes = alarmTime * 60;

        // Logic
        for (int i = 0; i < alarmTimeInMinutes; i++) {
            if (i != alarmTimeInMinutes)
                Thread.sleep(1000);
            else {
            System.out.println("Alarm");
            //Beep sound
            Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}