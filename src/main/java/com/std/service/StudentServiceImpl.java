package com.std.service;

import java.util.List;

import com.std.bean.Student;
import com.std.dao.StudentDao;

public class StudentServiceImpl implements StudentService
{

	StudentDao dao;
	
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public int insert(Student s) {
		int insert = dao.insert(s);
		if(insert == 0)
		{
			System.out.println("Invalid");
		}
		else
			System.out.println("success");
		return insert;
		
		
	}

	public int update(String sname, int snumber) {
		
		int update = dao.update(sname, snumber);
		return update;
	}

	public List<Student> findAll() {
		
		List<Student> findAll = dao.findAll();
		
		return findAll;
	}

	public Student displaystudent(int id) {
		
		Student displaystudent = dao.displaystudent(3);
		return displaystudent;
	}

}

