package org.jboss.tools.example.springmvc.repo;

import java.util.List;

import javax.persistence.EntityManager;
import org.jboss.tools.example.springmvc.domain.BookMarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BookMarksDaoImpl implements BookMarksDao {

	@Autowired
	private EntityManager em;
	@Override
	public BookMarks findBookMarkById(Long id) {
		// TODO Auto-generated method stub
		return em.find(BookMarks.class, id);
	}

	@Override
	public List<BookMarks> findAllBookMarks() {
		// TODO Auto-generated method stub
		List<BookMarks> bookMarks=em.createQuery("select bm from BookMarks bm ").getResultList();
		
		return bookMarks;
	}

	@Override
	public String saveBookMark(BookMarks bookMark) {
		// TODO Auto-generated method stub
		em.persist(bookMark);
		em.flush();
		return "";
	}
	@Override
	public long getBookNum(){
		long i=findAllBookMarks().size();
		return i;
	}

}
