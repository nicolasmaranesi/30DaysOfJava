package Day2.Exercise3;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void sayHello(){
        System.out.println( "Hello my name is " + name + " I am " + age + " and I'm " + gender);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

}
