public class Person {
  public int age;
  public int wisdom;
  public int fitness;

  public Person(int inputAge) {
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void setWisdom(int newWisdom) {
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness) {
    this.fitness = newFitness;
  }

  public void hasBirthday() {
    this.setAge(this.age + 1);    
    this.setWisdom(this.wisdom + 5);    
    this.setFitness(this.fitness - 3);    
  }


  public static void main(String[] args) {

    Person emily = new Person(20);

    System.out.println("Before birthday!");
    System.out.println("");

    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);

    emily.hasBirthday();
    System.out.println("");
    System.out.println("After birthday!");
    System.out.println("");

    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}