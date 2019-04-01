package pojo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String empname;
	private Integer sex;
	private Date birthday;
	private Integer deptId;//Íâ¼ü
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer id, String empname, Integer sex, Date birthday, Integer deptId) {
		super();
		this.id = id;
		this.empname = empname;
		this.sex = sex;
		this.birthday = birthday;
		this.deptId = deptId;
	}
	
}
