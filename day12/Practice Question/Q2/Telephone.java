// Q2 - Abstract class usage
abstract class Telephones {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephones {
    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing");
    }

    void DisplayNumber() {
        System.out.println("Display number to call");
    }

    @Override
    void lift() {
        System.out.println("Lifting TelePhone");
    }

    @Override
    void disconnect() {
        System.out.println("SmartTelephone is disconnecting");
    }
}

public class Telephone {
    public static void main(String[] args) {
        SmartTelephone SP = new SmartTelephone();
        SP.ring();
        SP.DisplayNumber();
        SP.disconnect();
        SP.lift();
    }

}
