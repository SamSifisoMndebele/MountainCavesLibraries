import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby",  true, 101));
        books.add(new Book(2, "1984", true, 102));
        books.add(new Book(3, "To Kill a Mockingbird",  false, 101));
        books.add(new Book(4, "Pride and Prejudice", true, 101));
        books.add(new Book(5, "The Catcher in the Rye",  true, 102));
        books.add(new Book(6, "The Hobbit",  true, 101));
        books.add(new Book(7, "The Great Gatsby", true, 101));
        books.add(new Book(8, "War and Peace",  true, 102));
        books.add(new Book(9, "The Odyssey",  true, 102));
        books.add(new Book(10, "The Divine Comedy",  true, 102));

        List<Library> libraries = new ArrayList<>();
        libraries.add(new Library(101, "Library 1", books));
        libraries.add(new Library(102, "Library 2", books));


        libraries.getFirst().printBooks();

        Book book1 = libraries.getFirst().borrowBook("The Great Gatsby");
        Book book2 = libraries.getFirst().borrowBook("The Great Gatsby");

        libraries.getFirst().printBooks();

        Book book3 = new Book(7, "The Great Gatsby",  true, 105);
        libraries.getFirst().returnBook(book1);
        libraries.getFirst().returnBook(book2);
        libraries.getFirst().returnBook(book3);

        libraries.getFirst().printBooks();
    }
}