package DAY1;
import java.util.Scanner;

public class Exercise2 {
static Scanner scan = new Scanner(System.in);
    public static float inputRadius(){
        float radius;
        System.out.println("Input the radius of the circle in cm: ");
        radius =  scan.nextFloat();
        return radius;
    }
    public static float getPerimeter(){
        float radius = inputRadius();
        float Pi = (float) Math.PI;
        float perimeter = (2* Pi *  radius);
        return  perimeter;
    }
    public static String showPerimeter(){
        float perimeter = getPerimeter();
        String perimeterAsString = String.format("%.2f",perimeter);
        String message = "The perimeter of the circle is: " + perimeterAsString+ " cm.";
        return message;
    }
    public static void main(String[] args) {
        System.out.println(showPerimeter());
    }
}
