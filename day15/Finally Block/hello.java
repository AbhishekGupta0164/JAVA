// Use of finally block in java
public class hello {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of this function");
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = greet();
        System.out.println("The result is: " + result);
        while (true) {
            try {
                System.out.println((a / b));
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("This is finally block " + b);

            }
            b++;
        }
    }
}
