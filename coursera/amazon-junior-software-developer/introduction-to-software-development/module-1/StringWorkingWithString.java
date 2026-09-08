public class StringWorkingWithString {
    public static void main(String[] args) {
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialize the length of the shortened book title
        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0, maxLength);
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = bookTitle.contains(searchWord);

        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);


        String sentence = "Java programming is fun and educational";
        
        boolean hasFun = sentence.contains("fun");
        System.out.println("The sentence contains the word \"Fun\": " + hasFun);
        
        String newSentence = sentence.replace("educational", "awesome");
        System.out.println("The new sentence: " + newSentence);

        int sentenceLength = sentence.length();
        System.out.println("The length of the original sentence: " + sentenceLength);

        String shortSentence = sentence.substring(0, 17);
        System.out.println("Shorten the sentence to 17 characters: " + shortSentence);

    }
}