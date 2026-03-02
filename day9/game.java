import java.util.Random;
import java.util.Scanner;

// Rock, Paper & Scissor Game 
public class game {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for seissor
        Scanner sc = new Scanner(System.in);
        String choice;

        while (true) { // used for repeat game

            System.out.println("Enter your choice \n0 for rock, \n1 for paper, \n2 for scissor: ");

            int userinput = sc.nextInt();

            sc.nextLine();

            Random random = new Random();
            int computerinput = random.nextInt(3);

            // comparision for result
            if (userinput == computerinput) {
                System.out.println("Draw");
            } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                    || userinput == 2 && computerinput == 1) {
                System.out.println("You Win!!");
            } else {
                System.out.println("Computer Win");
            }
            if (userinput < 0 || userinput > 2) {
                System.out.println("Invalid choice! Please enter 0, 1 or 2 only.");
                continue;
            }
            // computer choice
            if (computerinput == 0) {
                System.out.println("Computer Choice: ROCK");
            } else if (computerinput == 1) {
                System.out.println("Computer Choice: PAPER");
            } else {
                System.out.println("Computer Choice: SCISSOR");
            }
            System.out.println("Press R to replay or X to exit");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("X")) {
                System.out.println("Game Ended:)");
                break;
            }
        }
        sc.close();
    }
}