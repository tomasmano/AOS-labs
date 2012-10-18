package bookStore;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class BookStorePortTypeImpl implements BookStorePortType{

    public BookStorePortTypeImpl() {
    }

    public BookCollection searchBookByTitle(String part1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BookCollection searchBookByAuthor(String author) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeBook(String book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BookCollection listAllBooks(int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
