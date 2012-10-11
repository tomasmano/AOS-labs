/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoslab04;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tomy
 */
//@XmlRootElement(name="book")
public class Book {

    private String isbn;
    private String title;
    private String author;
    private String notes;

    public Book() {
    }

    public Book(String isbn, String title, String author, String notes) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.notes = notes;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", notes=" + notes + '}';
    }
}
