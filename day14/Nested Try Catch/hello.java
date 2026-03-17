
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 45;
        marks[2] = 43;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index: ");
            int idx = sc.nextInt();
            try {
                System.out.println("This is video number 82");
                try {
                    System.out.println(marks[idx]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("This index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }

        System.out.println("Thanks for using this program. ");
    }

}
