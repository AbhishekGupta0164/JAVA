
// Q1 - To use thread delay, current thread, getState(), Exception, demonstrate getPriority and setPriority methods 

class MyThread1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200); // Thread delay
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200); // Thread delay
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Hello, Welcome");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {

        MyThread1 M1 = new MyThread1();
        MyThread2 M2 = new MyThread2();

        // Setting priority
        M1.setPriority(5); // Normal priority
        M2.setPriority(10); // Maximum priority

        // Getting priority
        // If priority is not set then by default it is 5 (same for both threads)
        System.out.println("Priority of Thread 1: " + M1.getPriority());
        System.out.println("Priority of Thread 2: " + M2.getPriority());
        System.out.println("State of Thread 2: " + M2.getState());
        System.out.println("State of Current Thread: " + Thread.currentThread().getState());

        // Starting threads
        M1.start();
        M2.start();
    }
}