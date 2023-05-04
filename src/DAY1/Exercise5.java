package DAY1;

import java.util.Scanner;

public class Exercise5 {
    static Scanner scan = new Scanner(System.in);

    public static void programAimMessage(){
        String aimOfTheProgramme = "The aim of this programme is to identify whether the input number is positive or negative. \n";
        System.out.println(aimOfTheProgramme);
    }

    public static int inputNumber(){
        int number;
        System.out.println("Input your number: ");
        number = scan.nextInt();
        return number;
    }

    public static void analizePositiveOrNegativeNumber(){
        String message;
        int number = inputNumber();
        if (number > 0){
            message = "You input a positive number.";
        } else if (number == 0) {
            message = "you input the zero number.";
        }
        else {
            message = "you input a negative number.";
        }
        System.out.println(message);
    }

public static void main(String[] args) {
        programAimMessage();
        analizePositiveOrNegativeNumber();

    }

}
