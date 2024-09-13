import java.util.Random;
import java.util.Scanner;


public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 'rock', 'paper' and 'scissors' to play the game");

        String playerGuess = scanner.nextLine();
        String playersGuess = playerGuess.toLowerCase();

        int randomGuess = random.nextInt(3);
        String computersGuess;
        
        if(randomGuess==0) {
            computersGuess = "rock";
        } else if(randomGuess==1) {
            computersGuess = "paper";
        } else {
            computersGuess = "scissors";
        }

        System.out.println("Player's guess : "+playersGuess);
        System.out.println("Computer's guess : "+computersGuess);

        if(playersGuess.equals(computersGuess)) {
            System.out.println("Tie!!");
        } else if((playersGuess.equals("rock") && computersGuess.equals("scissors")) || (playersGuess.equals("paper") && computersGuess.equals("rock")) || (playersGuess.equals("scissors") && computersGuess.equals("paper"))) {
            System.out.println("Player Wins!!");
        } else {
            System.out.println("Computer Wins");
        }

    }
    
}