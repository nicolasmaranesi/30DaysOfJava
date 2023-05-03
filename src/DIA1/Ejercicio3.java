package DIA1;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner scan = new Scanner(System.in);

    public static void programAimMessage(){
        String aimOfTheProgramme = "The aim of this programme is to multiply two integers. \n";
        System.out.println(aimOfTheProgramme);

    }

    public static int inputFirstNumbet(){
        int firstNumber;
        System.out.println("Input the first number: ");
        firstNumber = scan.nextInt();
        return firstNumber;
    }

    public static int inputSecondNumber(){
        int secondNumber;
        System.out.println("Input the second number");
        secondNumber = scan.nextInt();
        return secondNumber;
    }

    public static int multiplyNumbers(){
        int firstNumber = inputFirstNumbet();
        int secondNumber = inputSecondNumber();
        int multiplicationProduct = firstNumber * secondNumber;
        return multiplicationProduct;
    }
    public static void showMultiplicationResult(){
        String multiplicationResult = Integer.toString(multiplyNumbers());
        System.out.println("The result is: " + multiplicationResult);
    }

    public static void main(String[] args) {
        programAimMessage();
        showMultiplicationResult();

    }
}

