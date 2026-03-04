// use of this reference of object which is created
class EkClass {

    int a;

    public int getA() {
        return a;
    }

    EkClass(int v) {
        this.a = v;
    }
    // EkClass(int a) { // same output as above
    // this.a = a;
    // }
    // EkClass(int a) { // error
    // a = a;
    // }

    public int returnname() {
        return 1;
    }
}

class DoClass extends EkClass {

    DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");

    }

}

public class hello1 {
    public static void main(String[] args) {
        EkClass ec = new EkClass(6);
        DoClass dc = new DoClass(6);
        System.out.println(ec.getA());

    }
}
