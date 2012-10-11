/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoslab04;

import java.util.Collection;
import javax.jws.WebService;

/**
 *
 * @author tomy
 */
@WebService
public interface BookService {

    boolean addBook(Book book);

    Collection<Book> listAllBooks();

    boolean removeBook(String isbn);

    Collection<Book> searchBookByAuthor(String author);

    Collection<Book> searchBookByTitle(String title);

    boolean updateBook(String isbn, String newTitle, String newAuthor, String newNotes);
}
