import java.util.Scanner;

public class AddBookCommand implements Command{
    @Override
    public void toExecute(Library library, Scanner sc) {
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Status (Read, Unread, In Progress): ");
        String status = sc.nextLine();
        Book book = new Book(title, author, year, status);
        library.addBook(book);
    }
}
