
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        guessingGame();
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

}