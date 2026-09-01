public class AssignmentOperators {
    public static void main(String[] args) {
        int  itemAvailable = 7;
        System.out.println("Current available items: " + itemAvailable);

        // Add 10 items
        itemAvailable += 10;

        System.out.println("Total available items after adding: " + itemAvailable);

        System.out.println("Current available items: " + itemAvailable);

        // Remove 9 items
        itemAvailable -= 9;
        System.out.println("Total available items after removing: " + itemAvailable);
    }
}