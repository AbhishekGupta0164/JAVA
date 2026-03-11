// Interfaces in JAVA
interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {

    void blowHorn123();

    void blowHorn898();
}

// more then one class is implements in interface , it is not allowed in
// abstract class to use more then one
class AvonCycle implements Bicycle, HornBicycle {
    void blowHorn() {
        System.out.println("poooo");
    }

    public void applyBrake(int decrement) {
        System.out.println("applying Break");
    }

    public void speedUp(int increment) {
        System.out.println("applying speedUp");
    }

    public void blowHorn123() {
        System.out.println("Kabhi khushi kabhi gum");
    }

    public void blowHorn898() {
        System.out.println("Main hoon naaa pooooooooo");
    }
}

public class hello {
    public static void main(String[] args) {
        AvonCycle cycleAbhi = new AvonCycle();
        cycleAbhi.applyBrake(1);
        // you can create properties in interface
        System.out.println(cycleAbhi.a);
        // you cannot modify the properties in interfaces as they are final
        // cycleAbhi.a = 423; //not allowed
        // System.out.println(cycleAbhi.a);

        cycleAbhi.blowHorn123();
        cycleAbhi.blowHorn898();
    }
}
