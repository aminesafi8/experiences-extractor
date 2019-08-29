package com.wevioo.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companies")
public class CompanyDTO {
	@Id
	private String id;
	private String name;
	private String url;
	private boolean scraped;
	private Date scrapeDate;

	public CompanyDTO() {
		// TODO Auto-generated constructor stub
	}	

	public CompanyDTO(String name, String url, boolean scraped, Date scrapeDate) {
		super();
		this.name = name;
		this.url = url;
		this.scraped = scraped;
		this.scrapeDate = scrapeDate;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isScraped() {
		return scraped;
	}

	public void setScraped(boolean scraped) {
		this.scraped = scraped;
	}

	public Date getScrapeDate() {
		return scrapeDate;
	}

	public void setScrapeDate(Date scrapeDate) {
		this.scrapeDate = scrapeDate;
	}


	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", name=" + name + ", url=" + url + ", scraped=" + scraped + ", scrapeDate="
				+ scrapeDate + "]";
	}
	
	

}
