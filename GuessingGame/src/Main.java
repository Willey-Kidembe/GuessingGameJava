import java.util.Scanner;
import java.util.Random;
public class Main {
//    Custom function
    static int numberRandom (){
        Random numrandom=new Random();
        int numberRandom= numrandom.nextInt(10+1);
        return numberRandom;
    }
    public static void main(String[] args) {
        int numberRandom=numberRandom();
        int numGuess1;
        int numGuess2;
        int numGuess3;
        String welcome1="Welcome to this Guessing game!";
        String welcome2="Would You like to play?";
        String choice1="1. Yes";
        String choice2="2. No";
        String Guess1="Guess 1:";
        String Guess2="Guess 2:";
        String Guess3="Guess 3:";
        String Guesses=("Please Enter number 1 to 10!");
        String Correct="Well done, You guessed right.";
        String Wrong="Sorry you Failed.";
        String DisplayRight="The correct guess is";
        Scanner keyboard=new Scanner(System.in);
        int reply;
        System.out.println(welcome1);
        System.out.println(welcome2);
        System.out.println(choice1);
        System.out.println(choice2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        reply=keyboard.nextInt();
        if (reply==1){
            System.out.println("You have 3 Chances: 1-10");
           System.out.println(Guess1);
           int GuessOne=keyboard.nextInt();
            System.out.println(Guess2);
            int GuessTwo=keyboard.nextInt();
            System.out.println(Guess3);
            int GuessThree=keyboard.nextInt();
            if(numberRandom==GuessOne||numberRandom==GuessTwo||numberRandom==GuessThree){
                System.out.println("The Correct Answer is: "+numberRandom);
                System.out.println(Correct);
            }else {
                System.out.println(Wrong);
                System.out.println("The Correct Answer is: "+numberRandom);
            }
        }else if(reply==2){
            System.out.println("Thanks for showing interest!");
        }else {
            System.out.println("Invalid Option");
        }
    }
}