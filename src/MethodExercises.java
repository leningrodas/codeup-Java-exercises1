import java.util.Scanner;

public class MethodExercises {

//    public static int numSum(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    ;
//
//    public static int numSub(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    ;
//
//    public static int numMulti(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    ;
//
//
//    public static int numDiv(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    ;
//
//    public static int numModu(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    ;
//
//    public static int numZero(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    ;
//
    public static void getInterger(int min, int max, int userInput) {
        if (userInput >= min && userInput <= 10) {
            System.out.println("Great you are within range ");
        } else {
            System.out.println("you are out of scope. bye felicia");
        }

    }


    //    public long factorialinput(int n) {
//        long fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
//    public static int factorialUser(int n) {
//        int resultOne = 1;
//        for (int i = 1; i <= n; i++) {
//            resultOne = resultOne * i;
//        }
//        return resultOne;
//    }
////

   public static int diceRoll() {
        Scanner sidesOfDice = new Scanner(System.in);
        System.out.println("Please enter how many sides of the dice their are");
        int howMany = sidesOfDice.nextInt();
        int die1;
        int die2;
        die1 = (int)(Math.random()*howMany)+1;
        die2 =(int)(Math.random()*howMany)+1;
        int roll = die1 + die2;
        String response = "you rolled a " + die1 + " and a " + die2 + " for a total of: " + roll;
        System.out.println(response);
        return roll;
    }





    public static void main(String[] args) {

//Questions 1


//        System.out.println(numSum(2,2));
//
//        System.out.println(numSub(5,7));
//
//        System.out.println(numMulti(5,5));
//
//        System.out.println(numDiv(20,5));
//
//        System.out.println(numModu(40,7));

//        System.out.println(numZero(7,0));


//  Questions 2:
//        Random rand = new random();

        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("enter number between 1 and 10");
//            int userNum = userInput.nextInt();
//            getInterger(1,10, userNum);
//
////

//question 3;


//        System.out.print("Enter the number whose factorial is to be found: ");
//        int n = userInput.nextInt();
//        int result = factorialUser(n);
//        System.out.println("The factorial of " + n + " is " + result);
//
//

//    question 4
//
//        System.out.println("enter a the number of sides for a pair of dice");
//        int sideDice = userInput.nextInt();
//        System.out.println("roll the dice and bet your life");
//        int resultTwo = diceRoll(die1, die2, roll, input);
//            System.out.println("result of dice roll is " + resultTwo);
//
//


        System.out.println(diceRoll());




}
}









