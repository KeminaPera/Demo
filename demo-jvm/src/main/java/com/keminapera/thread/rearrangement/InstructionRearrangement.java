package com.keminapera.thread.rearrangement;

public class InstructionRearrangement {

    private static int num = 0;
    private static boolean ready;


    static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.interrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
                System.out.println("read thread...");
            }
        }
    }

    static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over...");
        }
    }

    public static void main(String[] args) {
        ReadThread rt = new ReadThread();
        rt.start();
        WriteThread wt = new WriteThread();
        wt.start();

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        rt.interrupt();
        System.out.println("main exit...");
    }
}


