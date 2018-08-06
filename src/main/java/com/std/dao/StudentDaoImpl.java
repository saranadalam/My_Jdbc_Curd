package com.std.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.std.bean.Student;

public class StudentDaoImpl implements StudentDao {
	
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(Student s) {
		
		String qry="insert into jdbccurd value("+s.getSid() + ", '"+ s.getSname()+ "'," +s.getSnumber() +")";
		int insert = jt.update(qry);
		System.out.println(insert);
 		return insert;
	}

	/*public int update(String sname, int snumber) {
		Student s;
		String qry="update jdbccurd set sname='" + s.setName() + "'",+ snumber= where "+ sid= +"+s.setSid+";
		int update = jt.update(qry);
		
		return update;
	}
	*/

	public List<Student> findAll() {
		
		String qry="select *from jdbccurd";
		List<Student> slist=new ArrayList<Student>();
        List<Map<String, Object>> queryForList = jt.queryForList(qry);
        for(Map i:queryForList)
        {
        	Student s =new Student();
        	s.setSid((Integer) i.get("sid"));
        	s.setSname( (String) i.get("sname"));
        	s.setSnumber((Integer) i.get("snumber"));
            slist.add(s);

        }
        
		return slist;
	}

	public Student displaystudent(int id) {
		Student s = null;
		String qry="select * from jdbccurd where id=" + s.getSid();
		List<Map<String, Object>> queryForList = jt.queryForList(qry);
		
		
		return (Student) queryForList;
	}

	public int update(String sname, int snumber) {
		return 0;
	}

}
