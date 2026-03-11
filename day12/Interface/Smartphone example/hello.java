// Creating a class Smartphone implement interfaces and extend classes
interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("gm");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k");
    }
}

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {

    void callNumber() {
        System.out.println("Calling");
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class SmartPhone extends CellPhone implements wifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    // public void record4kVideo() {
    // System.out.println("Taking snap and Recording video in 4k");
    // }

    public String[] getNetworks() {
        System.out.println("Getting list of Networks: ");
        String[] networkList = { "Abhi", "Anirudh", "Ansh" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class hello {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.record4kVideo();
        // sp.greet(); --> Throws an error, it is not used as it is a private member
        String[] arr = sp.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
