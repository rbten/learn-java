class Shape {

    public double getArea() {

    }
}


class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

}


class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return radius * radius * 3.14;
    }
}


public class MyJavaApp {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];

        Shape[0] = new Circle(2);
        Shape[1] = new Rectangle(3, 4);

        // Shape object is calling children classes method
        System.out.println("Are of the Circle: " + Shape[0].getArea());
        System.out.println("Are of the Rectangle: " + Shape[1].getArea());

    }
}