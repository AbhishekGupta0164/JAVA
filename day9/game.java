import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for seissor
        Scanner.sc = new Scanner(System.in);
        System.out.print("Enter 0 for rock, 1 for paper and 2 for scissor");
        int userinput = sc.nextint();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        // comparision for output
        if (userinput == computerinput) {
            System.out.println("Draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                || userinput == 2 && computerinput == 1) {
            System.out.println("You Win!!");
        } else {
            System.out.println("Computer Win");

        }
        // outputs
        if (computerinput == 0) {
            System.out.println("Computer Choice: ROCK");
        } else if (computerinput == 1) {
            System.out.println("Computer Choice: PAPER");
        } else if (computerinput == 0) {
            System.out.println("Computer Choice: SCISSOR");
        }
    }
}