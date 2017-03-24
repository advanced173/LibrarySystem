package com.cc.library.service.impl;

import java.util.List;

import com.cc.library.dao.BookDao;
import com.cc.library.domain.Book;
import com.cc.library.domain.BookType;
import com.cc.library.domain.PageBean;
import com.cc.library.service.BookService;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<BookType> getAllBookTypes() {
		// TODO Auto-generated method stub
		return bookDao.getAllBookTypes();
	}

	@Override
	public PageBean<Book> findBookByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return bookDao.findBookByPage(pageCode,pageSize);
	}

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

	@Override
	public BookType getBookType(BookType bookType) {
		// TODO Auto-generated method stub
		return bookDao.getBookType(bookType);
	}

	@Override
	public Book getBookById(Book book) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(book);
	}

	@Override
	public Book updateBookInfo(Book updateBook) {
		// TODO Auto-generated method stub
		return bookDao.updateBookInfo(updateBook);
	}

	@Override
	public PageBean<Book> queryBook(Book book, int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return bookDao.queryBook(book,pageCode,pageSize);
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(book);
	}


}
