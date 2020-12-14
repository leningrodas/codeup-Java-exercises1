import java.util.Random;

public class ServerNameGenerator {

    static String[] adjetives = {"aggressive","agreeable","ambitious", "brave","calm","delightful","eager", "faithful", "capable", "damp"};

    static String[] nouns = {"animals","truck","table","lion","tiger king","wolf king","man","woman","computer","laptop"};

    static Random rando = new Random();
    static int  random10 = rando.nextInt((10 - 1) + 1);

    static Random rando2 = new Random();
    static int  random20 = rando.nextInt((10 - 1) + 1);



    public static String getrand(){
        return adjetives[random10] + "-" + nouns[random20];
    }


    public static void main(String[] args) {
        System.out.println(getrand());
    }

}
