package com.std.bean;

public class Student {
	
	
	private int sid;
	private String sname;
	private int snumber;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSnumber() {
		return snumber;
	}
	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", snumber=" + snumber + "]";
	}
	public Student() {
		super();
	}

}
