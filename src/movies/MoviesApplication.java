package movies;

import java.util.Scanner;

public class MoviesApplication {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movies movie1 = new Movies();





        System.out.println("user, what would you like to do? \n");

        System.out.println(0 + "- exit");
        System.out.println(1 + "- view all movies");
        System.out.println(2 + "- view movies in animated category");
        System.out.println(3 + "- view movies in drama category");
        System.out.println(4 + "- view movies in horror category");
        System.out.println(5 + "- view movies in he scifi category \n");


        int userInput = scanner.nextInt();
        System.out.println("entered your choice: " + userInput);













    }
}
