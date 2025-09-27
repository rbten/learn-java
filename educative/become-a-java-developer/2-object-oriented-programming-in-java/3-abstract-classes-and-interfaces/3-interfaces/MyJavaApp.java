// Base class
class Bird {

    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating!");
    }

}


interface CanFly {

    void flying();

}


class Parrot extends Bird implements CanFly {

    @Override
    public void flying() {
        System.out.println("Parrot is Flying");
    }
}

class Penguin extends Bird {

    public void walk() {
        System.out.println("Penguin is walking");
    }
}



public class MyJavaApp {
    public static void main(String[] args) {

        Parrot parrotOne = new Parrot();
        Penguin penguinOne = new Penguin();


        parrotOne.eat();
        parrotOne.flying();

        System.out.println();

        penguinOne.eat();
        penguinOne.walk();
    }
}