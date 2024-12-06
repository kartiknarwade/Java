import java.io.*;
import java.nio.file.*;

public class AddJavaSyntaxHighlighting {
    public static void main(String[] args) {
        // Path to the folder containing the .md files
        String folderPath = "D:\\git course"; // Replace with your folder path

        try {
            // Get all files in the folder
            Files.list(Paths.get(folderPath))
                 .filter(path -> path.toString().endsWith(".md")) // Process only .md files
                 .forEach(AddJavaSyntaxHighlighting::processFile);
            
            System.out.println("Syntax highlighting added to all .md files.");
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    private static void processFile(Path filePath) {
        try {
            // Read the content of the file
            String content = new String(Files.readAllBytes(filePath));
            
            // Add java at the start and  at the end
            String updatedContent = "java\n" + content + "\n";

            // Write the updated content back to the file
            Files.write(filePath, updatedContent.getBytes());

        } catch (IOException e) {
            System.err.println("Error processing file " + filePath + ": " + e.getMessage());
        }
    }
}