public class Bear {
    String species;

    public Bear(String speciesOfBear) {
        this.species = speciesOfBear;
    }

    public static void main(String[] args) {
        Bear baloo = new Bear("Sloth bear");

        System.out.println(baloo);

        baloo = null;
        System.out.println(baloo);
    }
}

