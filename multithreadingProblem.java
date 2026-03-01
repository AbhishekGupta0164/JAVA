
class bank {
    int balance = 100;

    synchronized void withdraw(int amount) { // synchronized keyword is used to make this method thread safe
        System.out.println(Thread.currentThread().getName() + " is going to withdraw");
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            balance = balance - amount;
            System.out.println("balance left " + balance);
        } else {
            System.out.println("insufficient balance");
        }
    }
}

class myThread1 extends Thread {
    bank b;

    myThread1(bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(100);
    }
}

public class multithreadingProblem {
    public static void main(String[] args) {
        bank b = new bank();
        myThread1 t1 = new myThread1(b);
        t1.setName("ansh");
        myThread1 t2 = new myThread1(b);
        t2.setName("ayush");
        t1.start();
        t2.start();

    }
}
