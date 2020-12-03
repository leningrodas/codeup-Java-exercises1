import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {


//        double pi = 3.14151;
//
////        String numberofPi = "the value of Pie is " ;
////        System.out.println(numberofPi + pi);
////
//        System.out.printf("the value of pie is aproximately %.2f. %n", pi);

        Scanner scanner = new Scanner(System.in);

//
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.print("enter three words: ");
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        String word3 = scanner.nextLine();
//        System.out.print("Your three words are --> " +  word1 + " " + word2 + " " + word3 );

        //**** walk through*****
//
//        System.out.println("please enter an interger ");
//        int number = scanner.nextInt();
//
//        System.out.println("please enter 3 words ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("three words are: \n %s \n %s \n %s.\n", word1, word2, word3 );
//        scanner.nextLine();
//
//





//        System.out.print("enter a sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.print("the sentence you entered " + userInput);


//            System.out.print("enter the width and length of codeup's classroom ");
//            int width = scanner.nextInt();
//            int length = scanner.nextInt();
//
//            float userWidth = (float) width;
//            float userLength = (float) length;
//
//            float Area = userWidth * userLength;
//            float Perimeter = ((userWidth * 2) + (userLength * 2));


//            System.out.print("The area of codeup class room is " + Area + " and the perimeter of code up is " + Perimeter );

//        scanner.useDelimiter("/n");
//        System.out.print("enter the width and length of codeup's classroom ");
//        int width = scanner.nextInt();
//        int length = scanner.nextInt();
//
//        float userWidth = (float) width;
//        float userLength = (float) length;
//
//        float Area = userWidth * userLength;
//        float Perimeter = ((userWidth * 2) + (userLength * 2));
//        System.out.print("The area of codeup class room is " + Area + " and the perimeter of code up is " + Perimeter );
//
////****walk through****

        System.out.println("enter a number for width and length");
        int length =  scanner.parseInt();
        int width = scanner.parseInt();

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        system.out.printf("the area for classroom is: %d %n", area);
        System.out.printf("the perimeter for classroom is %d %n", perimeter);



    }
}
