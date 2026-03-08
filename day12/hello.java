
class Parent1 {
    public Parent1() {
        System.out.println(" I am a base class constructor ");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract public void greet();
}

class Child1 extends Parent1 {
    @Override
    public void greet() {
        System.out.println("good morning, this is an overridden file ");
    }
}

abstract class Child2 extends Parent1 {
    public void th() {

    }
}

public class hello {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
