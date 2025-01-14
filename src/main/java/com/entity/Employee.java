package com.entity;

public class Employee {

	private int emp_id;
	private String name;
	private String mobile;
	private String city;
	private String domain;
	private long salary;

	private Company com;

	public Employee() {

	}

	public Employee(int emp_id, String name, String mobile, String city, String domain, long salary, Company com) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.domain = domain;
		this.salary = salary;
		this.com = com;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", mobile=" + mobile + ", city=" + city + ", domain="
				+ domain + ", salary=" + salary + ", com=" + com + "]";
	}

}
