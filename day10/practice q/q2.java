//create a class cellphone with methods to print ringing... , vibrating.. etc

class SmartPhone_Q2 {

    public void ring() {
        System.out.println("SmartPhone is ringing");
    }

    public void vibration() {
        System.out.println("SmartPhone is vibrating");
    }

    public void callfriend() {

        System.out.println("Friend is calling, phone is vbrating");
    }
}

public class q2 {
    public static void main(String[] args) {
        SmartPhone_Q2 iphone = new SmartPhone_Q2();
        iphone.ring();
        iphone.vibration();
        iphone.callfriend();
    }
}