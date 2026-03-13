
// Q3  --> creat class monkey with its mwthods, 
// create class human which inherit monkey class and
// implement basicAnimal interface with eat() and sleep() method

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Monkeyy {
    public static void main(String[] args) {
        Human Abhi = new Human();
        Abhi.sleep();
        Abhi.eat();
    }

}
