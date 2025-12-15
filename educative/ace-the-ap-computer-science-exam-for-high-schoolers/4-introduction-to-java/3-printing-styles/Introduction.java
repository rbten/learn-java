class Introduction {
    public static void main(String[] args) {
        System.out.println("My Name is Robert");
        System.out.println("I am learning Java");

        System.out.println();

        String name = "Tracy";
        int age = 25;
        System.out.format("My name is %s and I am %d years old.%nI am learning Java.", name, age);

        System.out.println("");
        System.out.println("");

        String nameOne = "John";
        int ageOne = 35;
        System.out.format("My name is %s and I am %d years old.%nI am learning JavaScript.", nameOne, ageOne);

        System.out.println("");
        System.out.println("");
        
        String nameTwo = "Mike";
        int ageTwo = 32;
        System.out.format("I am %s %nMy age is %d %nI like %f %nI am 99%% of energy", nameTwo, ageTwo, 3.14);
    }
}