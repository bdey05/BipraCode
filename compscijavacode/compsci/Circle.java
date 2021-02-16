package compsci;

public class Circle extends Shape {                       
    private static final double PI = Math.PI;   // constant
    private double diameter; 
    public Circle(double d){
    	d = diameter;
    }
    public double getArea () {                             //Line 10
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}