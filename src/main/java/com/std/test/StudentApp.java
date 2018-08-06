package com.std.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.std.bean.Student;
import com.std.service.StudentServiceImpl;

public class StudentApp {
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext cxt=new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
	
	StudentServiceImpl ssi=cxt.getBean("service",StudentServiceImpl.class);
	/*
	 * 
	 * Insert
	Student s= new Student();
    
	s.setSid(1);
	s.setSname("A Saran Kumar");
    s.setSnumber(8008);
    ssi.insert(s);
	System.out.println("inserted");
*/
	
	
	 List<Student> findAll = ssi.findAll();
	  
	  Iterator i=findAll.iterator();
	  while(i.hasNext()) {
	  
	  System.out.println(i.next());
	 
	  }
}
}
