import java.util.ArrayList;

public class Student {

    private String name;


    private ArrayList <Double> grades;



    public Student(double grades){
        this.grades = new ArrayList<>();
    }




    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
         }


    public String getName(){
        return name;
    }

    public void addGrades(Double grade){
        this.grades.add(grade);
    }

    public Double getGradeAverage(){
        double sum = 0;
         for(double grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }



    public static void main(String[] args) {
        Student newStudent = new Student("fred");
        System.out.println(newStudent.getName());

        newStudent.addGrades((double) 50);
        newStudent.addGrades((double) 50);
        newStudent.addGrades((double) 100);
        newStudent.addGrades((double) 100);
        System.out.println(newStudent.getGradeAverage());








    }


}
