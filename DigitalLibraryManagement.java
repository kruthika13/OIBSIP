import java.util.*;
class Book {
private String title;
private String author;
private long isbn;

public Book(String title, String author, long isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public long getISBN() {
    return isbn;
}
}

class Library{
private List<Book> books = new ArrayList<>();

public void addBook(Book book) {
    books.add(book);
}

public List<Book> getBooks() {
    return books;
}

public List<Book> searchBooks(String query) {
    List<Book> result = new ArrayList<>();

    for (Book book : books) {
        if (book.getTitle().contains(query) || book.getAuthor().contains(query)) {
            result.add(book);
        }
    }

    return result;
}

}

public class DigitalLibrarymanagement {
public static void main(String[] args) {
Library library = new Library();

//add some books
library.addBook(new Book("Clean code", "Robert cecil martin", 9780132350884L));
library.addBook(new Book("programming pearls", "Jon Bentley",9780201657883L));
library.addBook(new Book("introduction to algorithms","ronald rivest",8131760308L));
library.addBook(new Book("head first java","kathy sierra",9781491910771L));
library.addBook(new Book("html & css: Design and build web sites","jon ducket",9781118871645L));

// remove book
Book bookToRemove = null;
for (Book book : library.getBooks()){
    if (book.getISBN() == 9781491910771L){
        bookToRemove = book;
        break;
    }
}
if (bookToRemove != null) {
    library.getBooks().remove(bookToRemove);
}

// search for books
List<Book> results = library.searchBooks("Clean code");
System.out.println(" SEARCH RESULTS:");
for (Book book : results) {
    System.out.println(book.getTitle() + " by " + book.getAuthor());
}

// print all books
System.out.println("ALL BOOKS:");
for (Book book : library.getBooks()){
    System.out.println(book.getTitle() + " by " + book.getAuthor());
}
}
}