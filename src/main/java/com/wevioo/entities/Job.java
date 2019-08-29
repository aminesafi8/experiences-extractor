package com.wevioo.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


public class Job {
	
	 private String title;
	 private String  company;
	 @Field("date_range")
	 private String  dateRange;
	 private String location;
	 private String description;
	 @Field("li_company_url")
	 private String companyUrl;
    	 
	 
	 public Job() {
		// TODO Auto-generated constructor stub
	}
	 
	 


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDateRange() {
		return dateRange;
	}


	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCompanyUrl() {
		return companyUrl;
	}


	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}
	 
    	 

}
