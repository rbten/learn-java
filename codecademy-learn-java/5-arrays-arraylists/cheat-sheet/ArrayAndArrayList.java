import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {

        // create an ArrayList called students
        ArrayList<String> students = new ArrayList<String>();

        students.add("Robert");
        students.add("Harry");
        students.add("Cristiano");

        students.remove(0);
        students.remove("Harry");

        System.out.println(students);

        // create an array of 6 int elements
        int[] marks = {50, 55, 60, 65, 70, 80};

        System.out.println(marks[0]);
        System.out.println(marks[4]);

        int[] ages = new int[3];
        ages[0] = 50;
        ages[1] = 60;
        ages[2] = 70;
        ages[1] = 75;
    }
}