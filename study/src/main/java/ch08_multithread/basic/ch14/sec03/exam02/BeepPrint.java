package ch08_multithread.basic.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrint implements Runnable{
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
