
public class Person {

    public static void main(String[] args){

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person();
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());






    }


    private String name;


    public Person(String name){
        this.name = name;
    }

    public Person (){
        this.name = "default- set a name";
    }

    public String getName(){
        return this.name;
//TODO: change the name property to the passed value
    }

    public void setName(String name) {
//TODO: return the person's name
        this.name = name;

    }
    public void sayHello(){
        System.out.printf(" say hello ", name);
//TODO: print a message to the console using the person's name
    };




}
