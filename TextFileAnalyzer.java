
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text file path: ");
        String path = sc.nextLine();

        System.out.print("Enter a word to search in file: ");
        String word = sc.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        int wordOccurence = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length(); // It is used to count the characters from the line

                String[] words = line.split("\\s+");  //split() method is used to split the words form the line
                wordCount += words.length;   //It is used to count the words present in the line

                for (String word1 : words) {
                    if (word1.equalsIgnoreCase(word)) {   //Here the equalsIsIgnoreCase() method is used to ignore the difference between upper and lower case
                        wordOccurence++;
                    }
                }
            }

            System.out.println("Final Result:");
            System.out.println("Total lines found: " + lineCount);
            System.out.println("Total words found: " + wordCount);
            System.out.println("Total chars found: " + charCount);
            System.out.println("Total word occurence: " + wordOccurence);
        } catch (IOException e) {
            System.out.println("Got an error while reading file" + e.getMessage());
        }

        sc.close();

    }
}
