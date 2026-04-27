package ch08_multithread.basic.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample{

    public static void main(String[] args) {
        Thread thread = new Thread(new BeepPrint());
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
