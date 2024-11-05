import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        String pathFile = "library.dat";

        try {
            library.loadLibrary(pathFile);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing files found. Creating a new library.");
        }

        Map<Integer, Command> commands = new HashMap<>();
        commands.put(1, new AddBookCommand());
        commands.put(2, new RemoveBookCommand());
        commands.put(3, new ListBooksCommand());
        commands.put(4, new SaveAndExitCommand(pathFile));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Save and Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            Command command = commands.get(option);
            if (command != null) {
                command.toExecute(library, sc);
                if (option == 4) {
                    break; // Exit loop if option is 4
                }
            } else {
                System.out.println("Invalid option.");
            }
        }

    }
}
