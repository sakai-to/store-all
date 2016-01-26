
package jp.co.techmatrix.store.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.co.techmatrix.store.services.soap package. 
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

    private final static QName _AddNewBookOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addNewBookOperation");
    private final static QName _AddNewBookOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addNewBookOperationResponse");
    private final static QName _Book_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "book");
    private final static QName _DeleteBookOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "deleteBookOperation");
    private final static QName _DeleteBookOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "deleteBookOperationResponse");
    private final static QName _GetItemByIdOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByIdOperation");
    private final static QName _GetItemByIdOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByIdOperationResponse");
    private final static QName _GetItemByTitleOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByTitleOperation");
    private final static QName _GetItemByTitleOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByTitleOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.co.techmatrix.store.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link AddNewBookOperation }
     * 
     */
    public AddNewBookOperation createAddNewBookOperation() {
        return new AddNewBookOperation();
    }

    /**
     * Create an instance of {@link AddNewBookOperationResponse }
     * 
     */
    public AddNewBookOperationResponse createAddNewBookOperationResponse() {
        return new AddNewBookOperationResponse();
    }

    /**
     * Create an instance of {@link DeleteBookOperation }
     * 
     */
    public DeleteBookOperation createDeleteBookOperation() {
        return new DeleteBookOperation();
    }

    /**
     * Create an instance of {@link DeleteBookOperationResponse }
     * 
     */
    public DeleteBookOperationResponse createDeleteBookOperationResponse() {
        return new DeleteBookOperationResponse();
    }

    /**
     * Create an instance of {@link GetItemByIdOperation }
     * 
     */
    public GetItemByIdOperation createGetItemByIdOperation() {
        return new GetItemByIdOperation();
    }

    /**
     * Create an instance of {@link GetItemByIdOperationResponse }
     * 
     */
    public GetItemByIdOperationResponse createGetItemByIdOperationResponse() {
        return new GetItemByIdOperationResponse();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperation }
     * 
     */
    public GetItemByTitleOperation createGetItemByTitleOperation() {
        return new GetItemByTitleOperation();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperationResponse }
     * 
     */
    public GetItemByTitleOperationResponse createGetItemByTitleOperationResponse() {
        return new GetItemByTitleOperationResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link Book.Authors }
     * 
     */
    public Book.Authors createBookAuthors() {
        return new Book.Authors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addNewBookOperation")
    public JAXBElement<AddNewBookOperation> createAddNewBookOperation(AddNewBookOperation value) {
        return new JAXBElement<AddNewBookOperation>(_AddNewBookOperation_QNAME, AddNewBookOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addNewBookOperationResponse")
    public JAXBElement<AddNewBookOperationResponse> createAddNewBookOperationResponse(AddNewBookOperationResponse value) {
        return new JAXBElement<AddNewBookOperationResponse>(_AddNewBookOperationResponse_QNAME, AddNewBookOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "deleteBookOperation")
    public JAXBElement<DeleteBookOperation> createDeleteBookOperation(DeleteBookOperation value) {
        return new JAXBElement<DeleteBookOperation>(_DeleteBookOperation_QNAME, DeleteBookOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "deleteBookOperationResponse")
    public JAXBElement<DeleteBookOperationResponse> createDeleteBookOperationResponse(DeleteBookOperationResponse value) {
        return new JAXBElement<DeleteBookOperationResponse>(_DeleteBookOperationResponse_QNAME, DeleteBookOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByIdOperation")
    public JAXBElement<GetItemByIdOperation> createGetItemByIdOperation(GetItemByIdOperation value) {
        return new JAXBElement<GetItemByIdOperation>(_GetItemByIdOperation_QNAME, GetItemByIdOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByIdOperationResponse")
    public JAXBElement<GetItemByIdOperationResponse> createGetItemByIdOperationResponse(GetItemByIdOperationResponse value) {
        return new JAXBElement<GetItemByIdOperationResponse>(_GetItemByIdOperationResponse_QNAME, GetItemByIdOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByTitleOperation")
    public JAXBElement<GetItemByTitleOperation> createGetItemByTitleOperation(GetItemByTitleOperation value) {
        return new JAXBElement<GetItemByTitleOperation>(_GetItemByTitleOperation_QNAME, GetItemByTitleOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByTitleOperationResponse")
    public JAXBElement<GetItemByTitleOperationResponse> createGetItemByTitleOperationResponse(GetItemByTitleOperationResponse value) {
        return new JAXBElement<GetItemByTitleOperationResponse>(_GetItemByTitleOperationResponse_QNAME, GetItemByTitleOperationResponse.class, null, value);
    }

}
