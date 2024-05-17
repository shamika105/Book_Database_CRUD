package com.dal;

import java.util.List;

import com.pojo.Book;

public interface BookDAO {
	List<Book>getAllBooks();
	int adddNewBook(Book obj);
	int editBook(Book obj);
	int deleteBook(int id);
	
	 Book getBookById(int id);
	 List<Book>getBookByAuthor(String Author);

}
