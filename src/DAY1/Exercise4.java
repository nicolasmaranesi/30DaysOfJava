package DAY1;

import java.util.Scanner;

public class Exercise4 {

    static Scanner scan = new Scanner(System.in);

    public static void programAimMessage(){
        String aimOfTheProgramme = "The aim of this programme is to identify whether the input number is an odd number or an even number. \n";
        System.out.println(aimOfTheProgramme);
    }

    public static int inputNumber(){
        int number ;
        System.out.println("Input your number: ");
        number = scan.nextInt();
        return number;
    }

    public static void oddOrEvenNumber(){
        int number = inputNumber();
        String numberMessage;
        if (number % 2 == 0){
            numberMessage = "You input an even number!";
        }
        else {
            numberMessage = "You input an odd number!";
        }
        System.out.println(numberMessage);
    }

public static void main(String[] args) {
        programAimMessage();
        oddOrEvenNumber();

    }
}
