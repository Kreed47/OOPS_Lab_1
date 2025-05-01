import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCharacterCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();

        File file = new File(fileName);

        int wordCount = 0;
        int charCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("\n--- File Statistics ---");
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding whitespace): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found. Please make sure the file exists.");
        } finally {
            System.out.println("File operation attempted.");
            input.close();
        }
    }
}

