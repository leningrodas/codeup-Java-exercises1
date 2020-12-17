import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student {


    public GradesApplication(String name){
        super(name);
    }



    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Student newname1 = new Student("lening");
        newname1.addGrades((double)50);
        newname1.addGrades((double)60);
        newname1.addGrades((double)50);

        Student newname2= new Student("david");
        newname2.addGrades((double)50);
        newname2.addGrades((double)60);
        newname2.addGrades((double)50);

        Student newname3 = new Student("chumpchamp");
        newname3.addGrades((double)50);
        newname3.addGrades((double)60);
        newname3.addGrades((double)50);


        
        HashMap<String, Student> student = new HashMap<>();
        student.put("len", newname1);
        student.put("dav", newname2);
        student.put("chump", newname3);

        ArrayList<String> usernames = new ArrayList<String>(student.keySet());
//        System.out.println(usernames);
        System.out.println(newname1.getGradeAverage());

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for(String user : usernames){
            System.out.println("|" + user + "|");
        }


        System.out.println("what student would you like to see more information on? ");

        String choice1 = userInput.nextLine();


        if(usernames.contains(choice1)){
            System.out.printf(student.get(choice1).getName() + ": -" + "github username:" + choice1 + "\n" + "current average: " + student.get(choice1).getGradeAverage());
        } else {
            System.out.println("sorry, no student found with the github username of " + choice1);
        } while(! choice1.equals(usernames));















//        HashMap<String, Student> students =  new HashMap<>();
//
//        students.put("lening", "lenare214");
//        students.put("jocko", "discipline12");
//        students.put("goggins", "takesouls");
//        students.put("runner", "marathon32");
////        System.out.println(students);
////        System.out.println(students.get("lening"));
//
//





    }


}
