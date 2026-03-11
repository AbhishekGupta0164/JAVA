// Polymorphism in interfaces 
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

    void callNumber(int phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
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
        Camera cam = new SmartPhone(); // this is a Smartphone but, use it as a camera only, as object is of cam.
        // cam.getNetworks(); --> Not allowed
        // cam.sampleMeth(); // both are Not Allowed because camera doesn't requires
        // network wifi
        // so polymorphism donot give access to allow to use it as a wifi instead of
        // camera
        // If we are using (camera cam = new smartphone) then we have to use only camera
        // methods
        // If we are using (smartphone sp = new smartphone) then we are using all
        // methods of smartphone

        // JISKA OBJECT USKE HE PROPERTIES USE KAREGA REFERENCE KOE BHEE HO
        // (LIKE SMARTPHONE AS A REFRENCE WITH OBJECTS CAMERA, WIFI ETC)

        SmartPhone sp = new SmartPhone();
        sp.record4kVideo();
        sp.recordVideo();
        sp.getNetworks();
        sp.connectToNetwork("HKBF");
        sp.callNumber(23525);
    }
}
