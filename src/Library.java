import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String title) {
        books.removeIf(livro -> livro.getTitle().equalsIgnoreCase(title));
        System.out.println("Book removed: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void saveLibrary(String pathFile) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathFile))) {
            oos.writeObject(books);
            System.out.println("Library saved successfully.");
        }
    }

    @SuppressWarnings("unchecked")
    public void loadLibrary(String pathFile) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathFile))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Library loaded successfully.");
        }
    }
}
