package com.wevioo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wevioo.entities.LinkedinProfile;
@Repository
public interface  LinkedinProfileRepository extends MongoRepository<LinkedinProfile, String>{
	
	List<LinkedinProfile> findAll();
	


}
