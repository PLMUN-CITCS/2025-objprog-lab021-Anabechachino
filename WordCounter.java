import java.util.Scanner;

public class WordCounter {
    
    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }
    
    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+"); // Split by whitespace
        return words.length;
    }
    
    public static void main(String[] args) {
        // Get sentence input from user
        String sentence = getSentenceInput();
        
        // Count words
        int wordCount = countWords(sentence);
        
        // Display the word count
        System.out.println("Word count: " + wordCount);
    }
}
