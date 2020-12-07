
import java.util.Random;
import java.util.Scanner;

public class Highlow {

    public static int randomNum(int userG) {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int numRand;
        int numberOfGuesses = 0;
        numRand = rand.nextInt(100);
        do {
            System.out.println("Guess a number from 1 to 100");
            userG = userInput.nextInt();
            if (userG == numRand) {
                numberOfGuesses += 1;
                System.out.println("Good Guess, chump");
            } else if (userG < numRand) {
                numberOfGuesses += 1;
                System.out.println("HIGHER");
            } else {
                numberOfGuesses += 1;
                System.out.println("LOWER");
            }
            return numRand;
        } while (userG != numRand);
    }


 ;


    public static void main(String[] args) {

        System.out.println(randomNum(6));

    }
        }



