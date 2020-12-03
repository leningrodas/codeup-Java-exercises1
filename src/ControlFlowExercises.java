public class ControlFlowExercises {
    public static void main(String[] args) {

        //exercise 1 loop  basics
            int i;
            i = 5;

            while (i <= 15) {
                System.out.print(i++);
                System.out.print(" ");
            }


        //exercise 2 do while

        //b.a
//               int x = 2;
//            do {
//                if((x&1) ==0){
//                    System.out.println(x);
//                }
//                x++;
//            } while (x<=100);

           // ***walk through
//        int counter = 0;
//            do {
//                System.out.println(counter);
//                counter += 2;
//            }while(counter <= 100);
//
//

        //b.2

//                int x = 5, n = 100;
//
//            do {
//                System.out.println(x);
//                x--;
//            } while (x >= n) {
//
//        }

//        ***walkthrough
//        int counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter <= 1-0);
//
//                  ****b.3

//        int k = 2;
//        do {
//            System.out.println(k*k);
//            k+=1;
//        }while(k < 1000000);

//       for (int b = 2; b <= 1000000; b++){
//           System.out.println(b*b);
//       }

//        ********walkthrough

//        long start =2;
//            do{
//                System.out.println(start);
//                start *= start;
//            } while(start < 1000000);
//
//






        ///question 2s
//
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3) == 0)
//                System.out.println("fizz");
//         else if ((i % 5) == 0)
//            System.out.println("buzz");
//        else if (((i % 3) == 0) && ((i % 5) == 0))
//        System.out.println("fizzbuzz");
//        else System.out.println(i);
//
//    }


        //questions 3s

//        Scanner userInput = new Scanner(System.in);
//        String choice = "y";
//
//        do {
//            System.out.println("User input an integer: ");
//            int firstInt = userInput.nextInt();
//
//            String header = "Number  " + "Squared " + "Cubed   " + "\n"
//                    + "======  " + "======= " + "=====   ";
//            System.out.println(header);
//
//            int square = 0;
//            int cube = 0;
//
//            String row = "";
//            for (int i = 1; i <= firstInt; i++) {
//                square = i * i;
//                cube = i * i * i;
//
//                row = i + "       " + square + "       " + cube;
//                System.out.println(row);
//
//            }
//
//            // See if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = userInput.next();
//            System.out.println();
//
//        }
//        while (!choice.equalsIgnoreCase("n"));
//
////

        //****question 4
//        Scanner sc = new Scanner(System.in);
//
//        String choice = "y";
//
//    do {
//        System.out.println("User, input an a grade from 1 to 100: ");
//        int userGrade = sc.nextInt();
//
//
//        if (userGrade > 88)
//            System.out.println("You got an A");
//        else if (userGrade < 87 && userGrade > 80)
//            System.out.println("you got a B");
//        else if (userGrade < 79 && userGrade > 67)
//            System.out.println("you got a C");
//        else if (userGrade < 66 && userGrade > 60)
//            System.out.println("you got a D");
//        else System.out.println("you got an F");
//
//
//
//        System.out.print("Continue? (y/n): ");
//        choice = sc.next();
//        System.out.println();
//    } while (!choice.equalsIgnoreCase("n"));
//
















    }
}


