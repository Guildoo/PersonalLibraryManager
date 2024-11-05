import java.io.IOException;
import java.util.Scanner;

public class SaveAndExitCommand implements Command {
    private String pathFile;

    public SaveAndExitCommand(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    public void toExecute(Library library, Scanner sc) {
        try {
            library.saveLibrary(pathFile);
        } catch (IOException e) {
            System.out.println("Error saving library: " + e.getMessage());
        }
        System.out.println("leaving...");
        sc.close();
    }
}