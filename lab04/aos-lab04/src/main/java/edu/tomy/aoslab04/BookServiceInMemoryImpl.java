/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoslab04;

import edu.tomy.aoslab04.Book;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author tomy
 */
@WebService(endpointInterface = "edu.tomy.aoslab04.BookService")
public class BookServiceInMemoryImpl implements BookService {

    private static Collection<Book> booksDB = new ArrayList<Book>();

    static {
        booksDB.add(new Book("1234", "Meditation", "Descartes", "what a cool guy"));
        booksDB.add(new Book("6666", "Meditation", "Budha", "boooring"));
        booksDB.add(new Book("9876", "French Cooking", "Jean-Paul", "goood boooook.."));
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null) {
            return false;
        }
        return booksDB.add(book);
    }

    @Override
    public boolean removeBook(String isbn) {
        boolean contains = false;

        for (Iterator<Book> it = booksDB.iterator(); it.hasNext();) {
            Book book = it.next();
            contains = isbn.equals(book.getIsbn());
            if (contains) {
                booksDB.remove(book);
                break;
            }
        }
        return contains;
    }

    // umožní upravit název knihy, autora a poznámky (isbn je klíč a je tedy neměnné) 
    @Override
    public boolean updateBook(String isbn, String newTitle, String newAuthor, String newNotes) {
        Book book = getBookByIsnb(isbn);
        if (book == null) {
            return false;
        }
        if (newAuthor != null && newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }
        if (newTitle != null && !newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }
        if (newNotes != null && !newNotes.isEmpty()) {
            book.setNotes(newNotes);
        }
        return true;
    }

    private Book getBookByIsnb(String isbn) {
        if (isbn == null) {
            return null;
        }
        boolean contains = false;
        for (Iterator<Book> it = booksDB.iterator(); it.hasNext();) {
            Book book = it.next();
            contains = isbn.equals(book.getIsbn());
            if (contains) {
                return book;
            }
        }
        return null;
    }

    // alezne knihy, které mají zadaný název (vrací kolekci knih!) 
    @Override
    public Collection<Book> searchBookByTitle(String title) {
        boolean contains = false;
        Collection<Book> result = new ArrayList<Book>();

        for (Iterator<Book> it = booksDB.iterator(); it.hasNext();) {
            Book book = it.next();
            contains = title.equals(book.getTitle());
            if (contains) {
                result.add(book);
            }
        }
        return result;
    }

    // nalezne knihy, jejichž autor byl zadán jako parametr (též vrací kolekci) 
    @Override
    public Collection<Book> searchBookByAuthor(String author) {
        boolean contains = false;
        Collection<Book> result = new ArrayList<Book>();
        for (Iterator<Book> it = booksDB.iterator(); it.hasNext();) {
            Book book = it.next();
            contains = author.equals(book.getAuthor());
            if (contains) {
                result.add(book);
            }
        }
        return result;
    }

    // vylistuje isbn, autora a název všech knih, které jsou aktuálně v knihovně 
    @Override
    public Collection<Book> listAllBooks() {
        return booksDB;
    }

//    private void searchCollectionByInstanceVariable(String varName) {
//        boolean check = false;
//        check = varName.isEmpty() || Character.isUpperCase(varName.charAt(0));
//        if (check) {
//            throw new IllegalArgumentException("Illegal argument, cannot be emtpy or begin with small letter: "+varName);
//        }
//        try {
//            Class<?> c = Book.class;
//            Method m = c.getMethod("get" + varName);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException("Cannot perform searching. Unknow property "+varName);
//        }
//    }

}
