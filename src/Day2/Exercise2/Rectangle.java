package Day2.Exercise2;

public class Rectangle {

    private double base;
    private double high;

    public Rectangle(double base, double high){
        this.high = high;
        this.base = base;
    }

    public double calculateArea(){
        double area = base * high;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * base + 2 * high;
        return perimeter;
    }


    public double getHigh() {
        return high;
    }

    public double getBase() {
        return base;
    }
}
