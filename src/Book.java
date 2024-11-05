import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private String author;
    private int year;
    private String status;

    public Book(String title, String author, int year, String status) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status; // read, unread, in progress
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Status: " + status;
    }
}
