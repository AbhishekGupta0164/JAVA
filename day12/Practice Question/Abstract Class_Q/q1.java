// Question 1
// Create a abstract class Pen and extend it with methods write , refill, changeNib
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing Nib");
    }
}

public class q1 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();
    }
}
