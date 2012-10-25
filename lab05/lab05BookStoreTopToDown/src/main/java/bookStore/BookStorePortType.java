package bookStore;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 18 11:20:11 CEST 2012
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://j2ee.netbeans.org/wsdl/lab05BookStoreTopToDown/java/BookStore", name = "BookStorePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BookStorePortType {

    @WebResult(name = "part1", targetNamespace = "http://j2ee.netbeans.org/wsdl/lab05BookStoreTopToDown/java/BookStore", partName = "part1")
    @WebMethod
    public BookCollection searchBookByTitle(
        @WebParam(partName = "part1", name = "part1")
        java.lang.String part1
    );

    @WebResult(name = "books", targetNamespace = "http://j2ee.netbeans.org/wsdl/lab05BookStoreTopToDown/java/BookStore", partName = "books")
    @WebMethod
    public BookCollection searchBookByAuthor(
        @WebParam(partName = "author", name = "author")
        java.lang.String author
    );

    @Oneway
    @WebMethod
    public void removeBook(
        @WebParam(partName = "book", name = "book")
        java.lang.String book
    );

    @Oneway
    @WebMethod
    public void updateBook(
        @WebParam(partName = "book", name = "book")
        Book book
    );

    @Oneway
    @WebMethod
    public void addBook(
        @WebParam(partName = "book", name = "book")
        Book book
    );

    @WebResult(name = "part1", targetNamespace = "http://j2ee.netbeans.org/wsdl/lab05BookStoreTopToDown/java/BookStore", partName = "part1")
    @WebMethod
    public BookCollection listAllBooks(
        @WebParam(partName = "size", name = "size")
        int size
    );
}