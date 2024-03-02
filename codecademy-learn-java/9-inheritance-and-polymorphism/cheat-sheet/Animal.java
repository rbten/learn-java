// Parent class
class Animal {
  String sound;

  public Animal() {

  }

  public Animal(String snd) {
    this.sound = snd;
  }

  public void greeting() {
    System.out.println("The animal greets you.");
  }

  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal cat1 = new Cat();
    animal1.greeting();
    cat1.greeting();
  }
}

// Child class
class Dog extends Animal { 
  // super() method can act like the parent constructor inside the child class constructor.
  public Dog() {
    super("woof");
  } 
}

class Cat extends Animal {
  public void greeting() {
    System.out.println("The cat meows.");
  }
}

