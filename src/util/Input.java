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
            user = Integer.valueOf(getString());
        } while(user>=min && user <= max);
        return user;
            };


    public void getDouble(double min, double max){
        System.out.println("user, input a number to test your worth");

        double user = Double.valueOf(getString());
        try {
            if (user >= min && user <= max) {
                System.out.println("great you are worthy");
            } else {
                System.out.println("you are not worthy");
            }
         } catch (NumberFormatException e){
            System.out.println("format incorrect");
        }
    }

    public double getDouble(){
        try {
            System.out.println("enter a number");
            double user = Double.parseDouble(getString());
        } catch
        (NumberFormatException e) {
            System.out.println("the number format is incorrect...testing this sh");
        }  return getDouble();
    }

    public int getInt(){

       try {
            System.out.println("enter a number");
          int user1 = Integer.parseInt(getString());
        } catch (NumberFormatException e){
            System.out.println("the format is incorrect, enter a correct type");
        } finally {
            System.out.println("this is the finally, which will always run. so just testing it");
        } return getInt();


    }


}
