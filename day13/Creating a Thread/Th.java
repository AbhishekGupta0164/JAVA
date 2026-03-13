
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 332423) {
            System.out.println("My Thread is Running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread2 is chatting");
        }
    }
}

public class Th {
    public static void main(String[] args) {
        MyThread1 t1 = new Thread1();
        MyThread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
