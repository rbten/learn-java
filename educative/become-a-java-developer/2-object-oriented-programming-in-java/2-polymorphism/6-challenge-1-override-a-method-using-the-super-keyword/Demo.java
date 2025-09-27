class Shape {
    private String name;

    // public Shape(String name) {
    //     this.name = name;
    // }

    public Shape() {
        name = "Shape";
    }

    public String getName() {
        return this.name;
    }

}

class XShape extends Shape {

    private String name;

    public XShape(String name) {
        this.name = name;
    }

    public String getName() {

        // Problem HERE
        // this.name = super.getName() + this.name;
        
        return this.name;
    }
}

public class Demo {
    public static void main(String[] args) {
        
        Shape circle = new XShape("Circle");
        
        System.out.println(circle.getName());
    }
}