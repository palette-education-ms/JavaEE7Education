package jp.co.palettelink.book.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "M_BOOK")
public class Book {

	@Id
	@Column(name = "ISBN")
	@Pattern(regexp = "[0-9]{3}-[0-9]-[0-9]{2}-[0-9]{6}-[0-9]", message = "000-0-00-000000-0形式で入力してください")
	private String isbn;

	@NotNull(message = "書籍名は必須です")
	@Column(name = "NAME")
	private String name;

	@Column(name = "REGISTER_DATE")
	@Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


}
