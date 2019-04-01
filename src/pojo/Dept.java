package com.kgc.pojo;

import java.io.Serializable;

public class Dept implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String deptname;
	public Dept(Integer id, String deptname) {
		super();
		this.id = id;
		this.deptname = deptname;
	}
	public Dept() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
}
