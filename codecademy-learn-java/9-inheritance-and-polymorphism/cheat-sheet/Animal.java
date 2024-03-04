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

  public void eating() {
    System.out.println("The animal is eating.");
  }

  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal cat1 = new Cat();
    animal1.greeting();
    cat1.greeting();

    Dog myDog = new Dog();
    myDog.eating();

    Animal cat2, dog2, pig2;

    cat1 = new Cat();
    dog1 = new Dog();
    pig1 = new Pig();

    Animal[] animals = {cat1, dog1, pig1};

    for (Animal animal : animals) {
      
      animal.sound();
  
    }
  }
}

// Child class
class Dog extends Animal { 
  // super() method can act like the parent constructor inside the child class constructor.
  public Dog() {
    super("woof");
  } 

  @Override
  public void eating() {
    System.out.println("The dog is eating.");
  }
}

class Cat extends Animal {
  public void greeting() {
    System.out.println("The cat meows.");
  }
}

