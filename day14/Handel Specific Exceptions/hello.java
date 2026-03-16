
// Errors in Java and using try - catch blocks
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 45;
        marks[2] = 43;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[idx]);
            System.out.println("The value of array num is: " + marks[idx] / number);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occures!");
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfRoundsException occures!");
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("Some other exception occurs");
            System.out.println(e);

        }
    }
}
