package com.std.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.std.bean.Student;

public class EmployeeMappers implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student s=new Student();
		
		s.setSid(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setSnumber(rs.getInt(3));
		
		return s;
	}
	
	

}
