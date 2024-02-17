public class Person {
    // state of an object
    int age;
    String name;

    // constructor method
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // behavior of an object
    public void setValue() {
        age = 20;
        name = "robin";
    }

    public void getValue() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }


    // main method
    public static void main(String[] args) {
        // creates a new Person object
        Person Bob = new Person(31, "Bob");
        Person Alice = new Person(27, "Alice");

        // changes state through behavior
        Bob.setValue();
        Bob.getValue();

        Bob.age = 777;

        Bob.getValue();

    }
}