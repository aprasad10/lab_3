import java.util.Random;
import java.util.Scanner;

public class GuessGames {
    public static void main(String[] args) {
        guessingGame();
        rockPaperScissor();
    }

    public static void guessingGame(){

        Scanner in = new Scanner(System.in); // instantiating a scanner object
        int guess;
        Random random = new Random();
        String playAgain;


        do{
            int randomNumber= random.nextInt(99)+1;
            int i=5;
            playAgain="whatever";

            System.out.println("I'm thinking of a number between 1 and 100.");
            while(i>0){
                System.out.println("Guess what it is. You have " + i +" tries:");
                guess=in.nextInt();
                if(guess<randomNumber){
                    System.out.print("Nope! Too low. ");
                    i--;
                }
                else{
                    if(guess>randomNumber){
                        System.out.print("Nope! Too high. ");
                        i--;
                    }
                    else{
                        System.out.println("You got it!");
                        break;
                    }
                }
            }

            if(i==0){
                System.out.println("You lost. The number was " + randomNumber);
            }

            in.nextLine();

            while(!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")){
                System.out.println("Do you want to play again? (Y/N):");
                playAgain=in.nextLine();
                if(!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")){
                    System.out.println("Invalid Response.");
                }
            }
        }
        while(playAgain.equalsIgnoreCase("Y"));
        in.close();
    }

    public static void rockPaperScissor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play? yes or no");
        String answer = in.next();
        while (answer.equalsIgnoreCase("yes")) {
            Random rand = new Random();
            int randChoice = rand.nextInt(3) + 1;
            boolean keepPlaying = true;
            String play;
            do {
                System.out.println("Enter your choice: 1. paper, 2. scissors, 3. rock:");
                int guess = in.nextInt();
                switch (guess) {
                    case 1:
                        if (randChoice == guess) {
                            System.out.println("It is a tie!");
                        } else if (randChoice == 2) {
                            System.out.println("You lose! Scissors beats paper.");
                        } else {
                            System.out.println("You win! Paper beats rock.");
                        }
                        break;
                    case 2:
                        if (randChoice == guess) {
                            System.out.println("It is a tie!");
                        } else if (randChoice == 1) {
                            System.out.println("You win! Scissors beats paper.");
                        } else {
                            System.out.println("You lose! Rock beats scissors.");
                        }
                        break;
                    case 3:
                        if (randChoice == guess) {
                            System.out.println("It is a tie!");
                        } else if (randChoice == 1) {
                            System.out.println("You lose! Paper beats rock.");
                        } else {
                            System.out.println("You win! Rock beats scissors.");
                        }
                        break;
                    default:
                        System.out.println("Please guess from one of the options");
                }
                keepPlaying = false;
            } while (keepPlaying == true);
            System.out.println("Play again? yes or no");
            play = in.next();
            if (play.equalsIgnoreCase("yes")) {
                answer = play;
            }
            else {
                answer = play;
            }
        }
        if (answer.equalsIgnoreCase("no")) {
            in.close();
        }
    }
}