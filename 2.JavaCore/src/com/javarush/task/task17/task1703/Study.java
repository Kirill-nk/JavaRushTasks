package com.javarush.task.task17.task1703;

public class Study implements Runnable{
    private volatile boolean isCansel = false;

    public void cancel() {
        this.isCansel = true;
    }

    @Override
    public void run() {
        while (!this.isCansel) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Tik");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Study study = new Study();
        Thread clockThread = new Thread(study);
        clockThread.start();

        Thread.sleep(10000);
        study.cancel();
    }
}
