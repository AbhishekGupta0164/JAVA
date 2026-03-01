// question 1 - create a class cylinder and use getters & setters to set radius and height 
//  & to find surface area and volume

class cylinder {
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    // to find surface area
    public double surface_area() {
        return 2 * Math.PI * radius * height + 2 * 3.14 * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

public class q1 {
    public static void main(String[] args) {

        cylinder shape = new cylinder();
        shape.setRadius(9);
        System.out.println("The radius of cylinder is: " + shape.getRadius());
        shape.setHeight(12);
        System.out.println("The height of cylinder is: " + shape.getHeight());

        // to find surface area and volume of cylinder
        System.out.println("The surface area of cylinder is: " + shape.surface_area()); // 1187.52
        System.out.println("The volume of cylinder is: " + shape.volume()); // 3053.62

    }
}
