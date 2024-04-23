public class Book {
    private final int bookId;
    private final String title;
    private boolean available;
    private final int libraryId;

    public int getLibraryId() {
        return libraryId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(int bookId, String title, boolean available, int libraryId) {
        this.bookId = bookId;
        this.title = title;
        this.available = available;
        this.libraryId = libraryId;
    }
}
