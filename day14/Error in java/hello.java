
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Syntax error demo
        // int a = 5;
        // b = 6; //Error: b not declared!
        // int c = 0 //Eroor: no semicolon!
        // System.out.println(a + b);

        // Logical error demo
        // write a program to print all prime number between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is: " + 1000 / k);
    }
}
