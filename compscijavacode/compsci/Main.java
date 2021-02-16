package compsci;


public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle (5.0);
        Shape s2 = new Rectangle (5.0, 4.0);   //you will need to write Rectangle
        Shape s3 = new Square(4.5);  //you will need to write Square
        Shape larger = getLargerShape(s1,s2);
        Shape largest = getLargestShape(s1,s2,s3);

        System.out.println("The area of the shape with the highest area between the circle and the rectangle is: " + larger.getArea());
        System.out.println("The area of the shape with the highest area between the circle, rectangle, and square is: " + largest.getArea());
    }

    public static Shape getLargerShape(Shape s1, Shape s2) {
        if(s1.getArea() > s2.getArea())                       //Line 26
            return s1;
        else
            return s2;
    }
    
    public static Shape getLargestShape(Shape s1, Shape s2, Shape s3) {
    	Shape l = s1;
        if(s1.getArea() > s2.getArea() && s1.getArea()>s3.getArea())                       //Line 26
            l = s1;
        if(s2.getArea() > s1.getArea() && s2.getArea()>s3.getArea())                       //Line 26
            l = s2;
        if(s3.getArea() > s1.getArea() && s3.getArea()>s2.getArea())                       //Line 26
            l = s3;
        return l;
    }
}