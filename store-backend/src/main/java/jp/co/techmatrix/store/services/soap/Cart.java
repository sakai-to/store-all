package jp.co.techmatrix.store.services.soap;

import java.util.List;

import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.services.AbstractCart;

/**
 * JAX-WSを利用したWebサービスアプリケーション
 * @author kosugi
 *
 */
@Named
@WebService(name = "cart", serviceName = "cart")
public class Cart extends AbstractCart{
	@Override
	@WebMethod(operationName = "getItemByTitleOperation")
	public List<Book> getItemByTitle(@WebParam(name = "title") String title){
		return super.getItemByTitle(title);
	}

	@Override
	@WebMethod(operationName = "getItemByIdOperation")
	public Book getItemById(@WebParam(name = "id") int id){
		return super.getItemById(id);
	}

	@Override
	@WebMethod(operationName = "addNewBookOperation")
	public void addNewBook(@WebParam(name = "book") Book book){
		super.addNewBook(book);
	}

	@Override
	@WebMethod(operationName = "deleteBookOperation")
	public void deleteBook(@WebParam(name = "id") int id){
		super.deleteBook(id);
	}
}
