public class StringAdventure {
    public static void main(String args[]) {
        String text = "Adventure";

        int theLength = text.length();
        System.out.println("The length: " + theLength);

        char positionThree = text.charAt(2);
        System.out.println("The character at position 3: " + positionThree);

        String oneToFour = text.substring(0, 4);
        System.out.println("From position 1 to 4: " + oneToFour);



        String anotherText = "Adventure";

        boolean compareText = text.equals(anotherText);
        System.out.println("The \"" + text + "\" equals \"" + anotherText + "\" is: " + compareText);

        System.out.println("Uppercase the \"" + text + "\": " + text.toUpperCase());
        System.out.println("Lowercase the \"" + text + "\": " + text.toLowerCase());

        boolean containsVent = text.contains("vent");
        System.out.println("The \"" + text + "\" contains \"vent\" is: " + compareText);

        String replaceE = text.replace('e', 'a');
        System.out.println("Replace \'e\' with \'a\': " + replaceE);

    }
}