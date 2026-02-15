
import java.util.Scanner;

// code for rock paper scissors game
public class hello {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors Game!");
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter choice of 1st player: ");
        String player1 = sc.next();
        System.out.println("Enter choice of 2nd player: ");
        String player2 = sc.next();

        if (player1.equals(player2)) {

            System.out.println("It's a tie!");

        } else if (player1.equals("rock") && player2.equals("scissors")
                || player1.equals("paper") && player2.equals("rock")
                || player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("Player 1 wins!");

        } else {
            System.out.println("Player 2 wins!");
        }
    }
}