
package edu.tomy.aoslab04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.tomy.aoslab04 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBookByTitleResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "searchBookByTitleResponse");
    private final static QName _SearchBookByAuthorResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "searchBookByAuthorResponse");
    private final static QName _SearchBookByTitle_QNAME = new QName("http://aoslab04.tomy.edu/", "searchBookByTitle");
    private final static QName _AddBook_QNAME = new QName("http://aoslab04.tomy.edu/", "addBook");
    private final static QName _RemoveBookResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "removeBookResponse");
    private final static QName _UpdateBook_QNAME = new QName("http://aoslab04.tomy.edu/", "updateBook");
    private final static QName _ListAllBooks_QNAME = new QName("http://aoslab04.tomy.edu/", "listAllBooks");
    private final static QName _SearchBookByAuthor_QNAME = new QName("http://aoslab04.tomy.edu/", "searchBookByAuthor");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "updateBookResponse");
    private final static QName _RemoveBook_QNAME = new QName("http://aoslab04.tomy.edu/", "removeBook");
    private final static QName _ListAllBooksResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "listAllBooksResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "addBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.tomy.aoslab04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveBook }
     * 
     */
    public RemoveBook createRemoveBook() {
        return new RemoveBook();
    }

    /**
     * Create an instance of {@link ListAllBooksResponse }
     * 
     */
    public ListAllBooksResponse createListAllBooksResponse() {
        return new ListAllBooksResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link SearchBookByAuthorResponse }
     * 
     */
    public SearchBookByAuthorResponse createSearchBookByAuthorResponse() {
        return new SearchBookByAuthorResponse();
    }

    /**
     * Create an instance of {@link SearchBookByTitleResponse }
     * 
     */
    public SearchBookByTitleResponse createSearchBookByTitleResponse() {
        return new SearchBookByTitleResponse();
    }

    /**
     * Create an instance of {@link SearchBookByTitle }
     * 
     */
    public SearchBookByTitle createSearchBookByTitle() {
        return new SearchBookByTitle();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link RemoveBookResponse }
     * 
     */
    public RemoveBookResponse createRemoveBookResponse() {
        return new RemoveBookResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link SearchBookByAuthor }
     * 
     */
    public SearchBookByAuthor createSearchBookByAuthor() {
        return new SearchBookByAuthor();
    }

    /**
     * Create an instance of {@link ListAllBooks }
     * 
     */
    public ListAllBooks createListAllBooks() {
        return new ListAllBooks();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "searchBookByTitleResponse")
    public JAXBElement<SearchBookByTitleResponse> createSearchBookByTitleResponse(SearchBookByTitleResponse value) {
        return new JAXBElement<SearchBookByTitleResponse>(_SearchBookByTitleResponse_QNAME, SearchBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "searchBookByAuthorResponse")
    public JAXBElement<SearchBookByAuthorResponse> createSearchBookByAuthorResponse(SearchBookByAuthorResponse value) {
        return new JAXBElement<SearchBookByAuthorResponse>(_SearchBookByAuthorResponse_QNAME, SearchBookByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "searchBookByTitle")
    public JAXBElement<SearchBookByTitle> createSearchBookByTitle(SearchBookByTitle value) {
        return new JAXBElement<SearchBookByTitle>(_SearchBookByTitle_QNAME, SearchBookByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "removeBookResponse")
    public JAXBElement<RemoveBookResponse> createRemoveBookResponse(RemoveBookResponse value) {
        return new JAXBElement<RemoveBookResponse>(_RemoveBookResponse_QNAME, RemoveBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "listAllBooks")
    public JAXBElement<ListAllBooks> createListAllBooks(ListAllBooks value) {
        return new JAXBElement<ListAllBooks>(_ListAllBooks_QNAME, ListAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "searchBookByAuthor")
    public JAXBElement<SearchBookByAuthor> createSearchBookByAuthor(SearchBookByAuthor value) {
        return new JAXBElement<SearchBookByAuthor>(_SearchBookByAuthor_QNAME, SearchBookByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "removeBook")
    public JAXBElement<RemoveBook> createRemoveBook(RemoveBook value) {
        return new JAXBElement<RemoveBook>(_RemoveBook_QNAME, RemoveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "listAllBooksResponse")
    public JAXBElement<ListAllBooksResponse> createListAllBooksResponse(ListAllBooksResponse value) {
        return new JAXBElement<ListAllBooksResponse>(_ListAllBooksResponse_QNAME, ListAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

}
