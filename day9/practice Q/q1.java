// question 1 - create a class cylinder and use getters & setters to set radius and height

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

}

public class q1 {
    public static void main(String[] args) {
        cylinder shape = new cylinder();
        shape.setRadius(25);
        System.out.println(shape.getRadius());
        shape.setHeight(15);
        System.out.println(shape.getHeight());
    }
}
