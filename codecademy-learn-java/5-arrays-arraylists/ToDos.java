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
    ArrayList<String> poirotToDos = new ArrayList<String>();

    poirotToDos.add("visit the crime scene");
    poirotToDos.add("interview suspects");
    poirotToDos.add("let the little grey cells do their work");
    poirotToDos.add("trim mustache");
    poirotToDos.add("call all suspects together");
    poirotToDos.add("reveal the truth of the crime");

    System.out.println(sherlocksToDos.size());
    System.out.println(poirotToDos.size());

    if (sherlocksToDos.size() > poirotToDos.size()) {
      System.out.println("sherlocksToDos");
    } else {
      System.out.println("poirotsToDos");
    }
  }
}