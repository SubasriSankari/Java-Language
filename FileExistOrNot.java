import java.io.IOException;
import java.nio.file.*;

public class FileExistOrNot {
    public static void main(String[] args) {
        Path path = Paths.get("AddDigits.java");
        System.out.println("\n[Path] : " + path);
        printPath(path);
    }

    static void printPath(Path path) {
        System.out.println("\npath : " + path);
        System.out.println("\npath.toAbsolutePath() : " + path.toAbsolutePath());

        try {
            if (Files.notExists(path)) {
                return;
            }
            System.out.println("\npath.toRealPath() : " + path.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}