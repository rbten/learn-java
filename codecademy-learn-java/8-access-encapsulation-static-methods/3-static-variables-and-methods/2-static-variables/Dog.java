public class Dog {
  public static String genus = "Canis";

  public String name;
  public int age;

  public Dog(String inputName, int inputAge) {
    this.name = inputName;
    this.age = inputAge;
  }

  public static void main(String[] args) {
    System.out.println(Dog.genus);

    Dog snoopy = new Dog("Snoopy", 3);
    Dog ringo = new Dog("Ringo", 5);

    System.out.println(snoopy.genus);
    System.out.println(ringo.genus);
  }
}