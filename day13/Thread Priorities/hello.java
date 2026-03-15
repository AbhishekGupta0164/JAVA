// Thread Priorities

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int i = 34;

        while (i < 50) {
            System.out.println("Hello, I am thread: " + this.getName());
            i++;
        }
    }
}

public class hello {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Abhijeet");
        MyThread t2 = new MyThread("Daya");
        MyThread t3 = new MyThread("Saruke");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println("Priority of thread " + t1.getName() + " is: " + t1.getPriority());
        System.out.println("Priority of thread " + t2.getName() + " is: " + t2.getPriority());
        System.out.println("Priority of thread " + t3.getName() + " is: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
