package DAY3.Exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise5 {

    public static String inputWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = scan.nextLine().toLowerCase();
        return word;
    }

    public static char[] convertStringToCharArray() {
        String word = inputWord();
        char[] chars = word.toCharArray();
        return chars;
    }

    public static Map<Character, Integer> countLettersInWord() {
        char [] chars = convertStringToCharArray();
        Map<Character, Integer> countLetter = new HashMap<>();
        for (char letter : chars){
            if(Character.isLetter(letter)){
                if(countLetter.containsKey(letter)){
                    countLetter.put(letter,countLetter.get(letter)+1);
                }else {
                    countLetter.put(letter,1);
                }
            }
        }
        return countLetter;
    }

    public static void displayLettersCountResult(){
        Map<Character,Integer> ccuntLetters = countLettersInWord();
        for (Map.Entry<Character, Integer> entry : ccuntLetters.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        displayLettersCountResult();
    }
}
