//  Thread Method
class MyThread1 extends Thread {
    public void run() {
        int i = 34;

        while (i < 50) {
            System.out.println("Hello, I am thread111111s: ");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    public void run() {

        while (true) {
            System.out.println("Hello, I am thread: ");
        }
    }
}

public class hello {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        // t1.join(); // Wait for t1 to finish before starting t2
        t2.start();
    }
}
