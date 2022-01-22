package com.company;

import java.awt.*;
import java.time.LocalDateTime;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    private static final int MINIMAL_SPEED = 200;

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
    private static int maxLineSize;

    public static void main(String[] args) {
        initMaxLineSize();
        process();
    }

    private static void initMaxLineSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        maxLineSize = (int) (width / 8);
        System.out.println("with = " + width);
        System.out.println("maxLineSize = " + maxLineSize);
    }

    private static boolean generateBoolean() {
        return Math.random() > 0.4 + (double) getCurrentSecond() / 100;
    }

    private static int getCurrentSecond() {
        return LocalDateTime.now().getSecond();
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
            for (int part = 0; part < maxLineSize; part++) {
                System.out.print(
                        dotOrSpace(
                                generateBoolean()
                        )
                );
            }
            System.out.println();
            sleep(MINIMAL_SPEED + getCurrentSecond() * 10);
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
