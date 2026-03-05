// create a class circle and use inheritance to create another class cylinder from it 

class circle {
    public int radius;

    circle() {
        System.out.println("I am non parameterized constructor(default)");
    }

    circle(int r) {
        System.out.println("I am circle, parameterized constructor");//
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int r, int h) {
        System.out.println("I am cylinder parameterised constructor");
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.radius;
    }
}

public class q1 {
    public static void main(String[] args) {
        // circle objC = new circle(5);
        cylinder objCy = new cylinder(5, 10);

        System.out.println("Area = " + objCy.area());
        System.out.println("Volume = " + objCy.volume());
    }
}
