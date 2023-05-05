package DAY3.Exercise2;

import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.List;

public class Person{

    private String name;
    private int age;




    public Person(String name, int age){
        this.name= name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> createListOfPeople(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe",22));
        people.add(new Person("jim",11));
        people.add(new Person("Zoe",29));
        return people;
    }

    public static void showListOfPeople(List<Person> people){
        System.out.println("This is the list of people:");

        for (Person person : people){
            System.out.println(person.getName());
        }
    }



    public static void main(String[] args){
        List<Person> people = createListOfPeople();
        showListOfPeople(people);
    }

}
