public class logical {
    public static void main(String[] args) {
        // System.out.println("For Logical AND (&&) operator:");
        // boolean a = true;
        // boolean b = true;
        // boolean c = true;
        // if (a && b && c) {
        // System.out.println("y");
        // } else {
        // System.out.println("n");
        // }

        // System.out.println("For Logical OR (||) operator:");
        // boolean m = true;
        // boolean n = false;
        // boolean p = false;
        // if (m || n || p) {
        // System.out.println("y");
        // } else {
        // System.out.println("n");
        // }

        System.out.println("For Logical NOT (!) operator:");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("Not(a) is "); // true ka false, false ka true
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);
        System.out.println("Not(c) is ");
        System.out.println(!c);

        if (!a && !b && !c) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }

    }

}
