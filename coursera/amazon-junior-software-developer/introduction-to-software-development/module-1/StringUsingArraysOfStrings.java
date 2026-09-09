public class StringUsingArraysOfStrings {
    public static void main(String[] args) {
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        System.out.println("Superhero Names: ");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        System.out.println("Introduction years: ");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        System.out.println("Modified superhero name at position 3: " + superheroes[2].replace("Wonder Woman", "Thor"));

        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        System.out.println("Total superheroes names in String array: " + superheroes.length);
        System.out.println("Total superheroes introduction year in int array: " + introductionYears.length);

    }
}