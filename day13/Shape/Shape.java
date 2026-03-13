
/*  
This program should have individual classes for Rectangle, square, circle, cylinder, sphere
These classes should use inheritance to properly manage the code !
Include methods like volume, surface area and getters / setters for dimensions
*/

// Base class for shapes
class Shape1 {

    protected double length;
    protected double width;
    protected double radius;
    protected double height;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return length; // Assuming length and width are the same for square
    }
}

class Cylinder extends Shape1 {

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

class Circle extends Shape1 {

    public double surfaceArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape1 {

    public double area() {
        return length * length;
    }
}

class Rectangle extends Shape1 {

    public double area() {
        return length * width;
    }
}

class Sphere extends Shape1 {

    public double volume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

}

public class Shape {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(5);
        cy.setHeight(10);
        System.out.println("Volume of Cylinder: " + cy.volume());

        Circle ci = new Circle();
        ci.setRadius(5);
        System.out.println("Surface Area of Circle: " + ci.surfaceArea());

        Square sq = new Square();
        sq.setSide(5);
        System.out.println("Area of Square: " + sq.area());

        Rectangle re = new Rectangle();
        re.setLength(5);
        re.setWidth(3);
        re.setHeight(4);
        System.out.println("Area of Rectangle: " + re.area());

        Sphere sp = new Sphere();
        sp.setRadius(5);
        System.out.println("Volume of Sphere: " + sp.volume());

    }
}