// Interfaces in JAVA
interface Bicycle {
    int a = 47;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Horn_Bicycle {

    void blowHorn123();

    void blowHorn878();
}

// more then one class is implements using interface , it is not allowed in
// abstract class to use more then one
// --> multiple inheritance is not allowed as it form ambiguity , dimond problem
// arises
class AvonCycles implements Bicycle, Horn_Bicycle {
    void blowHorn() {
        System.out.println("poooo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("applying Break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("applying speedUp");
    }

    @Override
    public void blowHorn123() {
        System.out.println("Kabhi khushi kabhi gum");
    }

    @Override
    public void blowHorn878() {
        System.out.println("Main hoon naaa pooooooooo");
    }
}

public class hello {
    public static void main(String[] args) {
        AvonCycles cycleAbhi = new AvonCycles();
        cycleAbhi.applyBrake(1);
        // you can create properties in interface
        System.out.println(cycleAbhi.a);
        // you cannot modify the properties in interfaces as they are final
        // cycleAbhi.a = 423; //not allowed
        // System.out.println(cycleAbhi.a);

        cycleAbhi.blowHorn123();
        cycleAbhi.blowHorn878();
        cycleAbhi.blowHorn();

    }
}
