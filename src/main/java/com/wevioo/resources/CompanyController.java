package com.wevioo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wevioo.services.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@GetMapping
	public ResponseEntity<String> getAndInsertDistinctCompanies() {

		companyService.insertCompaniesToMongo(companyService.getAllCompaniesDistinct());

		return new ResponseEntity<String>("distinct Companies inserted to Mongo collection successfully ",
				HttpStatus.OK);

	}
}
