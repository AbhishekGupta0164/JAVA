//Threads are used to perform multiple tasks simultaneously.
//In Java, we can create a thread by extending the Thread class or by implementing the Runnable
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 90;
        while (i < 100) { // true condition, so this thread will run
            System.out.println("My Thread is Running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int j = 90;
        while (j < 20) { // false condition, so this thread will not run
            System.out.println("My Thread2 is chatting");
            j++;
        }
    }
}

public class Th {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
