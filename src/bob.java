import java.util.Scanner;

public class bob {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("talk to bob");
        String question = "sure";
        String endsWithExclam = "Whoa, Chill out! Son,";
        String dontSay = "Fine. Be that way!";
        String whatEv = "Whatever.";
        String empty = userInput.nextLine();

        if (userInput.equals("?")) {
            System.out.println(question);
        } else if (userInput.equals("!")) {
            System.out.print(endsWithExclam);
        } else if (userInput.equals(empty)) {
            System.out.println(dontSay);
        }


    }
}
