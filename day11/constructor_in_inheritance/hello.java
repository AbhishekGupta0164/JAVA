// constructors in inheritance with example
class Base1 {

    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) { // overloaded class of base1
        System.out.println("I am a overloaded constructor of base class " + x);
    }

}

class Derived1 extends Base1 {

    Derived1() {
        // super(0); // it calls its super (base) class where it finds value for 0
        // (-->x)
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) { // overloaded class of derived1
        super(x); // calls its super class where it find value for x
        System.out.println("I am a overloaded constructor of derived with value of y as: " + y);
    }
}

class Child_of_Derived extends Derived1 {

    Child_of_Derived() {
        System.out.println("I am a child of derived class constructor");
    }

    Child_of_Derived(int x, int y, int z) { // overloaded class of child of derived
        super(x, y); // calls its super class where it find value for x,y
        System.out.println("I am a overloaded constructor of derived with value of z as: " + z);
    }
}

public class hello {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(4, 9);
        Child_of_Derived cd = new Child_of_Derived(12, 32, 24);

    }

}
