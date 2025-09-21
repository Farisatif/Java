package polym;

public class Poly {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle > Area: " + rect.area() + ", Perimeter: " 
                + rect.perimeter());
        System.out.println("Circle > Area: " + circle.area() + ", Per: " 
                + circle.perimeter());
        System.out.println("Square > Area: " + square.area() + ", Per: " 
                + square.perimeter());
        System.out.println("Triangle > Area: " + triangle.area() + ", Per: " 
                + triangle.perimeter());
    }
}
