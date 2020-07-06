package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int MAX_LINE_SIZE = 10000;
    private static int speed;

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

    public static void main(String[] args) throws IOException, InterruptedException {
        // write your code here
        inputParams();
        process();
    }

    private static void inputParams() throws IOException {
        System.out.println("input speed 0-100 fast, 200-500 slow:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        speed = Integer.parseInt(reader.readLine());
    }

    private static boolean generateBoolean() {
        return Math.random() > 0.5;
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
            sleep(generate(speed));
        }
    }

    private static int generate(int max) {
        return (int) (Math.random() * max);
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
