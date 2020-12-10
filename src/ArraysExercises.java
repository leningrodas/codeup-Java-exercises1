import java.util.Arrays;

public class ArraysExercises {

    
//    public static Person[] addPersons(Person[] threePeeps, Person person) {
//        people = Arrays.copyOf(threePeeps, threePeeps.length + 1);
//        people[threePeeps.length -1] + person;
//        return people;
//    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[]threePeeps = new Person[3];
        threePeeps[0] = new Person("yo");
        threePeeps[1] = new Person("me");
        threePeeps[2] = new Person("ha");
        
        Person newPerson = new Person("test");

        for (Person people : threePeeps) {
            System.out.println(people.getName());
        }


    }
}
