
import java.util.Random;
import java.util.Scanner;

// Game --> Guess the number from 0 to 100 
/*
 * Create a class game, which allowa a user to play "Guess the Number"
 * game once, game should have the following methods
 * 1. constructor to generate the random number
 * 2. takeUserInput() to take a user input of number
 * 3. isCorrectNumber() to detech whether the number entered by user is true
 * 4. getters and setters for noOfGuesses
 * Use property such as noOfGuesses(int), etc to get this task done!
 */
class Game {

    final int number; // random number
    private int input; // user
    private int noOfGuesses = 0;

    public Game() { // constructor
        Random random = new Random();
        number = random.nextInt(100) + 1; // 1 to 100
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        input = sc.nextInt();
        noOfGuesses++;
    }

    public boolean isCorrectNumber() {
        if (input == number) {
            System.out.println("Match Found,Your Guessed it in " + noOfGuesses + " attempts, You Won The Game!");
            return true;
        } else if (input < number) {
            System.out.println("Too low! Try again");
        } else {
            System.out.println("Too high! Try again");
        }
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class Game1 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean correct = false;

        while (!correct) {
            g.takeUserInput();
            correct = g.isCorrectNumber();
        }

    }
}
