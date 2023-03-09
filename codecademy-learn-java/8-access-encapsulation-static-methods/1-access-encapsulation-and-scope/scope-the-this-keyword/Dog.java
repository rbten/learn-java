public class Dog {
  public String name;

  public Dog(String inputName) {
    name = inputName;
  }

  public void speakNewName(String name) {
    System.out.println("Hello, my new name is " + this.name);
  }

  public static void main(String[] args){
    Dog dogA = new Dog("Fido");
    Dog dogB = new Dog("Odie");

    dogA.speakNewName("A");
    dogB.speakNewName("B");

  }
}