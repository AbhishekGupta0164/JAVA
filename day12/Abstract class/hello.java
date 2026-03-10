// abstract class example
abstract class Parent {
    public Parent() {
        System.out.println(" I am a base class constructor ");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract public void greet();

    abstract public void greet1();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("good morning, this is an overridden file ");
    }

    @Override
    public void greet1() {
        System.out.println("good afternoon");
    }
}

abstract class Child2 extends Parent {
    public void th() {
        System.out.println("I am good");

    }
}

public class hello {
    public static void main(String[] args) {
        Child.sc = new Child();

        // create error as it is a abstract class so no object is created
        // Child2= new Child2();
        // Parent = new Parent();

        System.out.println("hello");
    }
}
