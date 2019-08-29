package com.wevioo.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wevioo.dto.CompanyDTO;
import com.wevioo.repositories.CompanyRepository;
import com.wevioo.repositories.LinkedinProfileRepository;

@Service
public class CompanyService {

	@Autowired
	LinkedinProfileRepository linkedinProfileRepository;
	
	@Autowired
	CompanyRepository companyRepository;

	public Set<CompanyDTO> getAllCompaniesDistinct() {

		Set<CompanyDTO> companies = new HashSet<>();

		linkedinProfileRepository.findAll().stream().forEach(e -> {

			e.getExperience().getJobs().stream().forEach(x -> {
				CompanyDTO company = new CompanyDTO(x.getCompany(), x.getCompanyUrl(), false, null);
				companies.add(company);
			});
		});

		return companies;

	}
	
	
	public void insertCompaniesToMongo(Set<CompanyDTO> listCompanies) {
		
		companyRepository.saveAll(listCompanies);
	}

}
