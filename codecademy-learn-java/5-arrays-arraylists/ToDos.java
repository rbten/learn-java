import java.util.ArrayList;
import java.util.Arrays;

public class ToDos {
  public static void main(String[] args) {
    ArrayList<String> toDoList = new ArrayList<String>();

    String toDo1 = "Water plants";
    String toDo2 = "Learn Java";
    String toDo3 = "Play FIFA23";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);

    String[] test = {"Ro", "10PM", "now"};
    System.out.println(Arrays.toString(test));

    // Sherlock todo
    ArrayList<String> sherlocksToDos = new ArrayList<String>();

    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");

    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();

    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");

    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());

    if (sherlocksToDos.size() > poirotsToDos.size()) {
      System.out.println("sherlocksToDos");
    } else {
      System.out.println("poirotsToDos");
    }

    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));

    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's third to-do:
    System.out.println(poirotsToDos.get(1));

    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    sherlocksToDos.set(3, "listen to Captain Hastings for amusement");

    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos+"\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
}