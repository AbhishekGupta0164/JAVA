// Thread using Runable Interface
class ThreadRunable1 implements Runnable {
    public void run() {
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
    }
}

class ThreadRunable2 implements Runnable {
    public void run() {
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
    }
}

public class hello {
    public static void main(String[] args) {
        ThreadRunable1 bullet1 = new ThreadRunable1();
        Thread gun1 = new Thread(bullet1);

        ThreadRunable2 bullet2 = new ThreadRunable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
