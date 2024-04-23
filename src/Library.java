import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Library {
    private final int libraryId;
    private final String name;
    private final List<Book> books;

    public Library(int libraryId, String name, List<Book> books) {
        this.libraryId = libraryId;
        this.name = name;
        this.books = books.stream().filter(book -> book.getLibraryId() == this.libraryId).toList();
    }

    public void printBooks() {
        System.out.println("***The available books in " + name + "***");
        for (Book book : books) {
            if (book.isAvailable()) System.out.println(book.getTitle());
        }
        System.out.println();
    }

    public Book borrowBook(String title) {
        Optional<Book> bookOpt = books.stream().filter(b -> Objects.equals(b.getTitle(), title) && b.isAvailable())
                .findFirst();
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            book.setAvailable(false);
            System.out.println("Borrowed " + book.getBookId() + " : " + book.getTitle());
            System.out.println();
            return book;
        } else {
            System.out.println("The book: " + title + " is not available.");
            System.out.println();
            return null;
        }
    }

    public void returnBook(Book book) {
        Optional<Book> bookOpt = books.stream().filter(b -> b.getBookId() == book.getBookId() && b.getLibraryId() == book.getLibraryId())
                .findFirst();
        if (bookOpt.isPresent()) {
            bookOpt.get().setAvailable(true);
            System.out.println("Book " + book.getBookId() + " : " + book.getTitle() + "is returned");
            System.out.println();
        } else {
            System.out.println("The book: " + book.getTitle() + " does not belong in this library.");
            System.out.println();
        }
    }
}
