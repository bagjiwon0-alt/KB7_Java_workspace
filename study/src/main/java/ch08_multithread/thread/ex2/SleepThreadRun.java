package ch08_multithread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SleepThread());
        thread1.start();
        // -> SleepThread의 run() 메서드 실행
    }
}
