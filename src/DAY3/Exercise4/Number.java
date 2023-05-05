package DAY3.Exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Number {
    private int number;
    public Number(int number){
        this.number= number;
    }


    public static List<Integer> createAListOfNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(2);
        numbers.add(0);
        numbers.add(8);
        numbers.add(1);
        return numbers;
    }
    public static List<Integer> sortedListOfNumbers(){
        List<Integer> numbers = createAListOfNumbers();
        Collections.sort(numbers);
        return numbers;
    }


    public static void main(String[] args) {
        List<Integer> numbers = sortedListOfNumbers();
        System.out.println("The sorted list of number is: " + numbers);
    }
}
