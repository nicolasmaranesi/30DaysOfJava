package DIA1;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scan = new Scanner(System.in);
    public static int inputAge(){
        int age;
        System.out.println("Input your age: ");
        age = scan.nextInt();
        return age;
    }

    public static String inputName(){
        String name;
        System.out.println("Input your name: ");
        name = scan.next();
        return name;
    }

    public static String showNameAndAge(){
        String ageAsString = Integer.toString(inputAge());
        String name = inputName();
        String message = "your name is " + name + " and your age is " + ageAsString;
        return message;
    }

    public static void main(String[] args) {
        System.out.println(showNameAndAge());
    }
}

