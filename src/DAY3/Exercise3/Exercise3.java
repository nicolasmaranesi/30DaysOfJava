package DAY3.Exercise3;

import java.util.Scanner;

public class Exercise3 {

    public static int inputNumber() {

            Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Input a positive number:  ");
            try {
                int number = scan.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("The number must be positive.");
                }
            } catch (Exception e) {
                System.out.println("Error: Please retry.");
                scan.nextLine();
            }
        }
    }

    public static int calculateFactorial(){
        int number = inputNumber();
        int factorialResult = 1;

        for (int i = 2; i <= number ; i ++ ){
            factorialResult = factorialResult * i ;
        }
        return factorialResult;
    }
    public static void showFactorialResult(){

                int factorialResult = calculateFactorial();
                System.out.println("The factorial result of the number you input is: " + factorialResult);

    }

    public static void main(String[] args) {
    showFactorialResult();

    }
}
