java
import java.io.*;
import java.nio.file.*;

public class RenameJavaToMdWithGit {
    public static void main(String[] args) {
        // Path to the folder containing the .java files
        String folderPath = "D:\\git course"; // Replace with your folder path

        try {
            // Get all files in the folder
            Files.list(Paths.get(folderPath))
                 .filter(path -> path.toString().endsWith(".java")) // Process only .java files
                 .forEach(RenameJavaToMdWithGit::renameFileAndUpdateGit);
            
            System.out.println("Renamed all .java files to .md files and updated Git.");
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    private static void renameFileAndUpdateGit(Path javaFilePath) {
        try {
            // Construct the new file name with .md extension
            String newFileName = javaFilePath.toString().replace(".java", ".md");
            Path newFilePath = Paths.get(newFileName);

            // Rename the file
            Files.move(javaFilePath, newFilePath, StandardCopyOption.REPLACE_EXISTING);

            // Run the Git mv command
            ProcessBuilder gitMv = new ProcessBuilder("git", "mv", javaFilePath.toString(), newFileName);
            gitMv.directory(new File(javaFilePath.getParent().toString()));
            Process process = gitMv.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Renamed and updated Git: " + javaFilePath.getFileName() + " -> " + newFilePath.getFileName());
            } else {
                System.err.println("Git mv failed for: " + javaFilePath.getFileName());
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error renaming file " + javaFilePath + ": " + e.getMessage());
        }
    }
}
