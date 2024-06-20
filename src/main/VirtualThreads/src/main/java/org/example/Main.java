package org.example;

public class Main {
    public static void main(String[] args) {

        Create_10_000_Threads();
    }

    private static void Create_10_000_Threads() {
        for (int i = 0; i < 10_000; i++) {
            Runnable runnable = new MyThread();
            Thread vThread = Thread.ofVirtual().start(runnable);
        }
    }
}