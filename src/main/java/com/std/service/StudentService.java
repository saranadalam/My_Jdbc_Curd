package com.std.service;

import java.util.List;

import com.std.bean.Student;

public interface StudentService {

public int insert(Student s);
	
	public int update(String sname,int snumber);
	
	public List<Student> findAll();
	
	public Student displaystudent(int id);
}
