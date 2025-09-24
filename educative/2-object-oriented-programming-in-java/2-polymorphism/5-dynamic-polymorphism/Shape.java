class Shape {

    public double getArea() {
        return 0;
    }
}


class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        Shape[] shape = new Shape[2]; 

        shape[0] = new Rectangle(10, 20);
        shape[1] = new Circle(30);

        System.out.println("The area of Circle: " + shape[1].getArea());
        System.out.println("The area of Rectangle: " + shape[0].getArea());
    }
}
 