package com.wevioo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "linkedin_profiles")
public class LinkedinProfile {
	
	@Id
	private String id;
	@Field("experiences")
	private Experience experience;

	
	public LinkedinProfile() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Experience getExperience() {
		return experience;
	}


	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	
}
