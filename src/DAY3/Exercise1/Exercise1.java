package DAY3.Exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static int inputNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a integer: ");
        int number = Integer.parseInt(scan.nextLine());
        return number;
    }
    public static void showTimesTable(int number){
        System.out.println("The time table for number "+ number+ " is: \n");
        for (int i = 1; i<= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }

    public static void getTimesTable(){
        try {
            int number = inputNumber();
            showTimesTable(number);
        }catch (NumberFormatException e){
            System.out.println("Error: You must input a integer number. Please try again.");
        }
    }
    public static void main(String[] args) {
        getTimesTable();
    }
}
