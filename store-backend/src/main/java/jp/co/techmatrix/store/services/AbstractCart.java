package jp.co.techmatrix.store.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jp.co.techmatrix.store.model.Book;

/**
 * EJB/REST/SOAPの大元
 * 
 * @author kosugi
 *
 */
@Named
@RequestScoped
public abstract class AbstractCart implements CartInterface{
	/**
	 * EntityManager
	 */
	@PersistenceContext(unitName = "bookstore")
	private EntityManager em;
	
	/**
	 * 本をタイトルで検索します。
	 * @param title 検索したい本のタイトル
	 * @return titleで検索した本のリストを返却します。
	 */
	@SuppressWarnings("unchecked")
	public List<Book> getItemByTitle(String title){
		return this.em.createNamedQuery(Book.SELECT_ALL_BOOKS_WHERE_TITLE)
				.setParameter("title", "%" + title + "%").getResultList();
	}
	
	/**
	 * 本をidで検索します。
	 * @param id 本のid
	 * @return idで検索した本を返却します。
	 */
	public Book getItemById(int id){
		return this.em.find(Book.class, id);
	}
	
	/**
	 * 引数の本を追加します。
	 * @param book 追加したい本の内容が記載されたインスタンス
	 */
	public void addNewBook(Book book){
		this.em.merge(book);
	}
	
	/**
	 * idで指定した本を削除します。
	 * @param id 削除したい本のidを指定します。
	 */
	public void deleteBook(int id){
		// 検索
		Book book = this.em.find(Book.class, id);
		
		// 削除
		this.em.remove(book);
	}
}
