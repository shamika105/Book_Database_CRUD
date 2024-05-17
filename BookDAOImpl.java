package com.dal;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.pojo.Book;
import com.dal.BookDAO;

public class BookDAOImpl implements BookDAO{
	private DataSource dsobj;
	
	public BookDAOImpl() {
		System.out.println("BookDAOImpl created......");
		
	}
	public void setDsObj(DataSource ds) {
		this.dsobj=ds;
		
	}
	public DataSource getDsObj() {
		return dsobj;
		
	}
	public List<Book>getAllBooks(){
		String sql="select * from book";
		
		try {
			Connection con =dsobj.getConnection();
			
			Statement stmt= con.createStatement();
			
			ResultSet rset= stmt.executeQuery(sql);
			
			List<Book>listBooks =new ArrayList();
			
			while(rset.next()) {
				listBooks.add(new Book(rset.getInt("bookid"),rset.getString("name"),rset.getString("Author"),rset.getDouble("price")));
				
			}
			return listBooks;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int addNewBook(Book obj) {
		return 0;
	}
	@Override
	public int adddNewBook(Book obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int editBook(Book obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> getBookByAuthor(String Author) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
