package jp.co.palettelink.book.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import jp.co.palettelink.book.entity.Book;

@Stateless
public class BookFacade {

	@PersistenceContext(unitName = "primary")
    private EntityManager em;

	public void create(Book book) {
		em.persist(book);
	}

	public List<Book> searchBookList() {

        final CriteriaBuilder builder = this.em.getCriteriaBuilder();
        final CriteriaQuery<Book> query = builder.createQuery(Book.class);
        query.from(Book.class);
        return this.em.createQuery(query).getResultList();
	}

}
