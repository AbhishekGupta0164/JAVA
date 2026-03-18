import java.util.Scanner;
// Creating a custom exception by extending the Exception class
// if someone enters invalid value then it will show exception with address and stops user from entering more value 
class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

}

public class hello {
    public static void main(String[] args) {
        int a = 43;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 99) {
            try {
                // throw new MyException();
                throw new ArithmeticException("This is an arithmetic exception");

            } catch (Exception e) {
                System.out.println(e.toString()); // Defines what prints when you use System.out.println(e)
                System.out.println(e.getMessage()); // Defines the message returned by e.getMessage()
                e.printStackTrace();

            }
        }
    }
}
