import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog =
      new ArrayList<Book>();

    public void addBook(Book newBook) {
        catalog.add(newBook);
    }
}