public interface hello {

    @FunctionalInterface // optional but recommended
    interface DemoAnnony {
        void meth1();

        // void meth2(); // commented to make it functional for lambda
    }

    // class AbhiFunc implements DemoAnnony {
    // @Override
    // public void meth1() {
    // System.out.println("Method 1 implementation");
    // }
    // }

    // class AnnonyDemo implements DemoAnnony {
    // public void display() {
    // System.out.println("Hello, World!");
    // }

    // @Override
    // public void meth1() {
    // System.out.println("Method 1 implementation");
    // }
    // }

    public static void main(String[] args) {

        // METHOD 1
        // AnnonyDemo obj = new AnnonyDemo();
        // obj.display();
        // obj.meth1();

        // METHOD 2
        // Anonymous class implementation
        // DemoAnnony obj = new DemoAnnony() {
        // @Override
        // public void meth1() {
        // System.out.println("Method 1 implementation");
        // }
        // };
        // obj.meth1();

        // LAMBDA EXPRESSION
        DemoAnnony obj = () -> {
            System.out.println("Method 1 implementation using lambda");
        };

        obj.meth1();
    }
}