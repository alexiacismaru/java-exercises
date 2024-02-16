import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("module6");//represents a path in a filesystem --returns  a Path-instance
        Path fileInDir = dir.resolve("my_file.txt");//construct a new Path out of two paths

        if (!Files.exists(dir)) {
            Files.createDirectory(dir);
        }

        if (!Files.exists(fileInDir)) {
            Files.createFile(fileInDir);
        }

        Files.write(fileInDir, "Lars Willemsens".getBytes());//write text to the file
        //OR: Files.write(fileInDir, List.of("Lars Willemsens"));

        Map<String, Object> attributes = Files.readAttributes(fileInDir, "*");//obtain the file's attributes --retrieve
                                                                                       //all attributes
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.printf("%-20s: %s%n", entry.getKey(), entry.getValue());
        }//print the file's attributes and their values using a formatted string

        Files.copy(fileInDir, dir.resolve("my_files_copy.txt"));//create a copy of the file
    }
}
