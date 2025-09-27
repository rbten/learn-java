// The base class Shape
class Shape {
    public double getArea() {
        return 0;
    }
}


// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        return width * height;
    }

}


// A Circle is a Shape with a specific radius
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}



public class MyJavaApp {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];

        shape[0] = new Circle(2);
        shape[1] = new Rectangle(3, 4);

        System.out.println("The area of the Circle: " + shape[0].getArea());
        System.out.println("The area of the Rectangle: " + shape[1].getArea());
    }
}