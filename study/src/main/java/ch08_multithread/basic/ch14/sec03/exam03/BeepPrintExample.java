package ch08_multithread.basic.ch14.sec03.exam03;

import ch08_multithread.basic.ch14.sec03.exam02.BeepPrint;

import java.awt.*;

public class BeepPrintExample extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        thread.start();

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("띵");
        }

    }

}
