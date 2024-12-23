import java.io.*;
import java.nio.file.*;

public class AddCodeHeaderIfJavaExists {
    public static void main(String[] args) {
        // Path to the folder containing the .md files
        String folderPath = "D:\\git course"; // Replace with your folder path

        try {
            // Get all files in the folder
            Files.list(Paths.get(folderPath))
                 .filter(path -> path.toString().endsWith(".md")) // Process only .md files
                 .forEach(AddCodeHeaderIfJavaExists::processFile);
            
            System.out.println("Added ##code before java in all applicable .md files.");
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    private static void processFile(Path filePath) {
        try {
            // Read the content of the file
            String content = new String(Files.readAllBytes(filePath));
            
            // Modify the content: Add ##code before java
            String updatedContent = content.replace("## code", "## Code");

            // Write the updated content back to the file
            Files.write(filePath, updatedContent.getBytes());

        } catch (IOException e) {
            System.err.println("Error processing file " + filePath + ": " + e.getMessage());
        }
    }
}