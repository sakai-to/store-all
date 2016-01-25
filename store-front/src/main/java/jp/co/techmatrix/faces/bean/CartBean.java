package jp.co.techmatrix.faces.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * header.xhtmlと関連づけるManagedBean
 * @author kosugi
 *
 */
@Named
@RequestScoped
public class CartBean{
	private String title = "";
	
//	@Inject
//	private Cart proxy;
//	
//	private List<Book> books = null;

	/**
	 * titleの取得
	 * @return
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 * titleの取得
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * 本の検索を実施する
	 */
	public void search(){
	}
}
