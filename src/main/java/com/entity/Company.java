package com.entity;

public class Company {

	private int company_id;
	private String company_name;
	private String industry_type;

	public Company() {

	}

	public Company(int company_id, String company_name, String industry_type) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.industry_type = industry_type;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getIndustry_type() {
		return industry_type;
	}

	public void setIndustry_type(String industry_type) {
		this.industry_type = industry_type;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", industry_type="
				+ industry_type + "]";
	}

}
