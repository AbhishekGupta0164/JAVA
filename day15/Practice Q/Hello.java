import java.util.Scanner;

//  Problem set on exceptions
public class Hello {
    public static void main(String[] args) {
        // Problem 1 - write a program to demonstrate syntax,
        // Syntax error - int a = 7

        // int age = 78;
        // int year_born = 2000 - 78; // logical error
        // System.out.println(6 / 0);

        // problem 2 - print hello during arithmetic exception and hi during illegal
        // argument exception

        // try {
        // int a = 655 / 9;

        // } catch (IllegalArgumentException e) {
        // System.out.println("Hi, this is Illegal Argument Exception");
        // } catch (ArithmeticException e) {
        // System.out.println("Hello, this is Arithmetic Exception");
        // }

        // problem 3 - throw a custom exception if max retries are reached

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 8;
        marks[2] = 9;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the index of the array: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;

            } catch (Exception e) {
                System.out.println("Invalid index. Please enter a valid index.");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Max retries reached. Exiting the program.");
        }

    }
}
