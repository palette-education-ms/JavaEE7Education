package jp.co.palettelink.book.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.palettelink.book.entity.Book;
import jp.co.palettelink.book.service.BookFacade;

@Named
@ViewScoped
public class BookRegisterBean implements Serializable {

	@Inject
	BookFacade bookFacade;

	Book book = new Book();

	public void register() {
		book.setRegisterDate(new Date());
		bookFacade.create(book);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
