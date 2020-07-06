package com.company;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    private static final int MAX_LINE_SIZE = 100;
    private static final int SPEED = 200;

    private final static String[] COLORS = new String[]{
            "\u001B[30m",
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // write your code here
        process();
    }

    private static boolean generateBoolean() {
        return Math.random() > 0.4 + (double) LocalDateTime.now().getSecond()/100;
    }


    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void process() {
        while (true) {
            for (int part = 0; part < MAX_LINE_SIZE; part++) {
                System.out.print(
                        dotOrSpace(
                                generateBoolean()
                        )
                );
            }
            System.out.println();
            sleep(SPEED + LocalDateTime.now().getSecond() * 10);
        }
    }

    private static String dotOrSpace(boolean dot) {
        if (dot) {
            return randomColor() + "*" + ANSI_RESET;
        }
        return " ";
    }

    private static String randomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
