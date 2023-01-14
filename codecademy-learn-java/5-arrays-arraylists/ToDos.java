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
  }
}