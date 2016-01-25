package jp.co.techmatrix.store.services;

import java.util.List;

import jp.co.techmatrix.store.model.Book;

public interface CartInterface{
	public List<Book> getItemByTitle(String title);
	public Book getItemById(int id);
	public void addNewBook(Book book);
	public void deleteBook(int id);
}
