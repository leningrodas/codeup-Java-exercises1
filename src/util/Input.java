package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

//
//    public Input (){
//        this.scanner = new Scanner(System.in);
//    }




   public String getString(){
        String user;
        System.out.println("user, enter string");
        user = scanner.nextLine();
        return user;
    }




    public Boolean yesNo() {
        System.out.println("True or false, choose your life");
        String userString = scanner.next().trim();
        return userString.equalsIgnoreCase("y") ||
                userString.equalsIgnoreCase("yes");
    }

   public int getInt (int min, int max){
        int user;
        do {
            System.out.println("User, input a number and if it is within rage. you may go on.");
            user = scanner.nextInt();
        } while(user>=min && user <= max);
        return user;
            };


    public void getDouble(double min, double max){

        System.out.println("user, input a number to test your worth");
        double user = scanner.nextDouble();
        if(user >= min && user <= max ){
            System.out.println("great you are worthy");
        } else {
            System.out.println("you are not worthy");
        }

    }



}
