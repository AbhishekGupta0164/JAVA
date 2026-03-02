// Inheritance --> example using base class and derived class 
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and seting x now: ");
        this.x = x;
    }

    public void printMe() {
        System.out.println("i am a constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class inheritance {
    public static void main(String[] args) {
        // creating object of base class
        Base b = new Base();
        b.setX(4); // it can only access base class (X), it can't access derived class property (Y)
                   // if we use set(y) here it give error as base cannot access derived class
        System.out.println(b.getX());

        // creating an object of derived class
        // it can access derived class(Y) and base class(X) property also as a derived
        // class
        Derived d = new Derived();

        System.out.println("I am a derived class but i have access to base class seting x now: ");
        d.setX(3);
        System.out.println(d.getX());

        d.setY(34);
        System.out.println("I am a derived class seting y now:  ");
        System.out.println(d.getY());
    }
}
