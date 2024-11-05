import java.util.Scanner;

public interface Command {
    void toExecute(Library library, Scanner sc);
}
