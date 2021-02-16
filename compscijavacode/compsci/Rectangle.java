package compsci;

public class Rectangle extends Shape {                       
    private double width;   // constant
    private double length;
    public Rectangle(double w, double l){
    	width = w;
    	length = l;
    }
    public double getArea(){                             //Line 10
        return width*length;
    }
}