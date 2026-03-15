class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thread is giving ID");
        // while (true) {
        // System.out.println("I am a thread");
        // }
    }
}

public class hello {
    public static void main(String[] args) {
        MyThread t = new MyThread("Abhi");
        MyThread t2 = new MyThread("Ranaji");

        t.start();
        t2.start();
        System.out.println("The id of the thread t: " + t.getId());
        System.out.println("The name of the thread t: " + t.getName());
        System.out.println("The id of the thread t2: " + t2.getId());
        System.out.println("The name of the thread t2: " + t2.getName());

    }
}
