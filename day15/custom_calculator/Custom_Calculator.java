
/*   
       * Create a custom calculator which throws the following operations:
       * 1. + add
       * 2. - sub
       * 3. * multiply
       * 4. / division
       * 
       * which throws the following exceptions
       * 
       * 1. Invalid input exception ex: 8 & 7
       * 2. cannot divide by 0 exception
       * 3. max input exception, if any input is greater then 100000
       * 4. max multiply reach exception - cannot multiply by number greater then 7000
       */

import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Invalid Input Exception";
    }
}

class MaxMultiplyReachException extends Exception {
    @Override
    public String toString() {
        return "Cnnot multiply number greater than 7000 - Max Multiply Reach Exception";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater then 100000 ";
    }
}

class calculator {
    public int a;
    public int b;

    public int add() {
        System.out.println("Sum of a+b is: " + (a + b));
        return (a + b);
    }

    public int subtraction() {
        System.out.println("Substraction of a-b is: " + (a - b));
        return (a - b);
    }

    public int multiply() throws MaxMultiplyReachException {
        if (a >= 7000 || b >= 7000) {
            throw new MaxMultiplyReachException();
        }
        System.out.println("Multiplication of a*b is: " + (a * b));
        return (a * b);
    }

    public int division() throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        System.out.println("Division of a/b is: " + (a / b));
        return (a / b);

    }

}

public class Custom_Calculator {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter value of b: ");
            int b = sc.nextInt();

            // Max input exception
            if (a > 100000 || b > 100000) {
                throw new MaxInputException();
            }

            // invalid input exception
            if (a < 0 || b < 0) {
                throw new InvalidInputException();
            }

            calculator cl = new calculator();
            cl.a = a;
            cl.b = b;

            cl.add();
            cl.subtraction();
            cl.multiply();
            cl.division();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
