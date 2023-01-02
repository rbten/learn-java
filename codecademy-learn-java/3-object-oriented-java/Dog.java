public class Dog {
  String breedOfDog;
  double ageOfDog;

  public Dog(String dogBreed, double age) {
    System.out.println("Constructor invoke!");
    breedOfDog = dogBreed;
    ageOfDog = age;
  }

  public static void main(String[] args) {
    System.out.println("Main method invoke!!!!");

    Dog lulu = new Dog("Corgi", 2);
    Dog milo = new Dog("Shiba", 10);

    boolean isLuluOlder = lulu.ageOfDog > milo.ageOfDog;
    double totalAge = lulu.ageOfDog + milo.ageOfDog;

    System.out.println("Two dogs created: a "+lulu.breedOfDog+" and a "+milo.breedOfDog+".");
    System.out.println("Lulu is older than Milo: "+isLuluOlder);
    System.out.println("Sum of age: "+ totalAge);
  }
}