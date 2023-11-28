public class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.size = 40;
        myDog.bark();
    }
}