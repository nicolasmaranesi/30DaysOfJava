package Day2.Exercise5;

public class Triangle {
    private double base;
    private double high;

    public Triangle(double base, double high){
        this.base = base;
        this.high = high;
    }

    public double calculateArea(double base, double high){
        double area = (base * high) / 2;
        return area;
    }

    public double calculatePerimeter(double base, double high){

        double perimeter = (2 * base) + ( 2 * high);
        return perimeter;
    }

    public double getBase() {
        return base;
    }

    public double getHigh() {
        return high;
    }
}
