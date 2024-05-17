package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dal.BookDAOImpl;

public class TestBookCRUD {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("MyDatabaseBean.xml");
		System.out.println("sc loaded....");
		
		BookDAOImpl bkDao =(BookDAOImpl)context.getBean("bookDao"); //<bean id="bookDao" >
		
		bkDao.getAllBooks().forEach(b->System.out.println(b));
	}

}
