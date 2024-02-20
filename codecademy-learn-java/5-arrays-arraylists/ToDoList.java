import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void printInstruction(String nameList) {
        System.out.println("");
        System.out.println(nameList + ":");
        System.out.println("Press 1 - Add");
        System.out.println("Press 2 - Remove");
        System.out.println("Press 3 - Edit");
        System.out.println("Press 4 - Print");
        System.out.println("Press 0 - Exit");
    }

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();

        // Add tasks
        // toDoList.add("Learn English");
        // toDoList.add("Eat breakfast");
        // toDoList.add("Walk");

        // System.out.println(toDoList);

        // System.out.println(toDoList.size());

        // System.out.println(toDoList.get(2));

        // toDoList.set(2, "Run");
        // System.out.println(toDoList);
        
        // toDoList.remove(0);
        // System.out.println(toDoList);

        // System.out.println(toDoList.indexOf("Walk"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Name of your list: ");
        String nameUserList = sc.nextLine();

        printInstruction(nameUserList);

        while (true) {
            System.out.print("Your command: ");
            int inputUser = sc.nextInt();
            sc.nextLine();

            if (inputUser == 0) {
                break;
            }

            switch(inputUser) {
            case 1:
                System.out.print("Your task: ");
                String itemUserAdd = sc.nextLine();
                toDoList.add(itemUserAdd);
                break;
            case 2:
                System.out.print("Task to remove: ");
                int taskToRemove = sc.nextInt();
                toDoList.remove(taskToRemove);

                System.out.print("Remove successfully");
                System.out.println("");
                System.out.println(nameUserList + ":");
                System.out.println(toDoList);
                break;
            case 3:
                System.out.print("Task to edit: ");
                int taskToEdit = sc.nextInt();
                sc.nextLine();
                System.out.print("New task: ");
                String newTask = sc.nextLine();
                toDoList.set(taskToEdit, newTask);

                System.out.println("Edit successfully");
                System.out.println("");
                System.out.println(nameUserList + ":");
                System.out.println(toDoList);
                break;
            case 4:
                System.out.println(nameUserList + ":");
                System.out.println(toDoList);
                break;
            default:
                System.out.println("Press from 1 to 4, please!");
            }
        }

    }
}