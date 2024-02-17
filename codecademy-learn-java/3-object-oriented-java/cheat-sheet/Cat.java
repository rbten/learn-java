public class Cat {
    String furType;
    boolean containsClaws;

    public Cat(String furLength, boolean hasClaws) {
        this.furType = furLength;
        this.containsClaws = hasClaws;
    }

    public static void main(String[] args) {
        Cat garfield = new Cat("Long-hair", true);

    }
}