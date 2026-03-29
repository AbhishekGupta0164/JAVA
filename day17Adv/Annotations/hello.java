// Annotations

class Phone {
    public void showtime() {
        System.out.println("Time is 9:30");
    }
}

@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();

    // void thisMethod2(); // this will give an error because functional interface
    // can have only one abstract method
}

class NewPhone extends Phone {
    @Override
    public void showtime() {
        System.out.println("Time is 9:30");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class hello {
    @SuppressWarnings("deprecation") // to ignore the warning of using deprecated method
    public static void main(String[] args) {

        NewPhone phone = new NewPhone();
        phone.showtime();
        phone.sum(5, 7);
    }
}
