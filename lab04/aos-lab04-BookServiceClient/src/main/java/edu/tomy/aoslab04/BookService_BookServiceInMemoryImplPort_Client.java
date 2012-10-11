package edu.tomy.aoslab04;

/**
 * Please modify this class to meet your needs This class is not complete
 */
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1 Thu Oct 11 12:00:26 CEST 2012
 * Generated source version: 2.3.1
 *
 */
public final class BookService_BookServiceInMemoryImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://aoslab04.tomy.edu/", "BookServiceInMemoryImplService");

    private BookService_BookServiceInMemoryImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = BookServiceInMemoryImplService.WSDL_LOCATION;
        if (args.length > 0) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        BookServiceInMemoryImplService ss = new BookServiceInMemoryImplService(wsdlURL, SERVICE_NAME);
        BookService port = ss.getBookServiceInMemoryImplPort();

        {

            System.out.println("Invoking addBook...");
            edu.tomy.aoslab04.Book _addBook_arg0 = null;
            boolean _addBook__return = port.addBook(_addBook_arg0);
            System.out.println("addBook.result=" + _addBook__return);


        }
        {
            System.out.println("Invoking removeBook...");
            java.lang.String _removeBook_arg0 = "9876";
            boolean _removeBook__return = port.removeBook(_removeBook_arg0);
            System.out.println("removeBook.result=" + _removeBook__return);


        }
        {
            System.out.println("Invoking searchBookByTitle...");
            java.lang.String _searchBookByTitle_arg0 = "Meditation";
            java.util.List<edu.tomy.aoslab04.Book> _searchBookByTitle__return = port.searchBookByTitle(_searchBookByTitle_arg0);
            System.out.println("searchBookByTitle.result=" + _searchBookByTitle__return);


        }
        {
            System.out.println("Invoking searchBookByAuthor...");
            java.lang.String _searchBookByAuthor_arg0 = "Budha";
            java.util.List<edu.tomy.aoslab04.Book> _searchBookByAuthor__return = port.searchBookByAuthor(_searchBookByAuthor_arg0);
            System.out.println("searchBookByAuthor.result=" + _searchBookByAuthor__return);


        }
        {
            System.out.println("Invoking listAllBooks...");
            java.util.List<edu.tomy.aoslab04.Book> _listAllBooks__return = port.listAllBooks();
            System.out.println("listAllBooks.result=" + _listAllBooks__return);


        }
        {
            System.out.println("Invoking updateBook...");
            java.lang.String _updateBook_arg0 = "1234";
            java.lang.String _updateBook_arg1 = "Tomy";
            java.lang.String _updateBook_arg2 = "";
            java.lang.String _updateBook_arg3 = "";
            boolean _updateBook__return = port.updateBook(_updateBook_arg0, _updateBook_arg1, _updateBook_arg2, _updateBook_arg3);
            System.out.println("updateBook.result=" + _updateBook__return);


        }

        System.exit(0);
    }
}
