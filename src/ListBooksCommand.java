import java.util.Scanner;

public class ListBooksCommand implements Command {
    @Override
    public void toExecute(Library library, Scanner sc) {
        library.listBooks();
    }
}
