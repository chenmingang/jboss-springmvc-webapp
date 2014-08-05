package org.jboss.tools.example.springmvc.repo;

import java.util.List;

import org.jboss.tools.example.springmvc.domain.BookMarks;

public interface BookMarksDao {
	
	/**
	 * 通过id查找bookmark
	 * @param id bookmark的id
	 * @return
	 */
	public BookMarks findBookMarkById(Long id);
	
	/**
	 * 查询所有bookmark
	 * @return
	 */
	public List<BookMarks> findAllBookMarks();
	
	/**
	 * 保存
	 * @param bookMark
	 * @return
	 */
	public String saveBookMark(BookMarks bookMark);  
	
	public long getBookNum();
}
