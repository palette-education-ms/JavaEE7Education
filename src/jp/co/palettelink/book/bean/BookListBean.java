package jp.co.palettelink.book.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.palettelink.book.entity.Book;
import jp.co.palettelink.book.service.BookFacade;

@Named
@RequestScoped
public class BookListBean {

	@Inject
	BookFacade bookFacade;
	List<Book> bookList;

	public void list() {
		bookList = bookFacade.searchBookList();
	}

	public void delete() {

	}

	public void update() {

	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}


}
