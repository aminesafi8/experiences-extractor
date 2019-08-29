package com.wevioo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wevioo.dto.CompanyDTO;

@Repository
public interface CompanyRepository extends MongoRepository<CompanyDTO, String>{
	
	CompanyDTO findOneByName(String companyName);
	

}
