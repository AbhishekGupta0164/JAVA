
public class hello {
    public static void main(String[] args) {
        int a = 3242;
        int b = 0;
        // Without try
        // int c = a / b;
        // System.out.println("The result is: " + c);

        // With try
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide, Reason: ");
            System.out.println(e);
        }
    }
}