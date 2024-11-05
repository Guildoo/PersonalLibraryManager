import java.util.Scanner;

public class RemoveBookCommand implements Command {
    @Override
    public void toExecute(Library library, Scanner sc) {
        System.out.println("Title of book to remove: ");
        String titleRemove = sc.nextLine();
        library.removeBook(titleRemove);
    }
}
