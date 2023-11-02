/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11;

/**
 *
 * @author student
 */
class NThread extends Thread {
    public void run() {
        System.out.println("Priority of Thread: " + Thread.currentThread().getPriority());
        try {
            sleep(1000); // Use sleep without "this"
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Lab11_q4 {
    public static void main(String args[]) {
            NThread t1 = new NThread();
            NThread t2 = new NThread();
            NThread t3 = new NThread();
            t1.setPriority(5);
            t2.setPriority(Thread.MAX_PRIORITY);
            t3.setPriority(1);
            t1.start();
            t2.start();
            t3.start();
            t1.interrupt();
            t2.interrupt();
            t3.interrupt();
    }
}
