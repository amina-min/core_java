package com.taskdemo;

public class PrintChar implements Runnable {

    private char charToPoint;
    private int times;

    PrintChar(char c, int i) {
        charToPoint = c;
        times = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(times+ charToPoint);

        }
    }

}
