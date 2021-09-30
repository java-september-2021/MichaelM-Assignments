package com.michaelm.driverlicense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelm.driverlicense.models.License;
import com.michaelm.driverlicense.models.Person;
import com.michaelm.driverlicense.repositories.LicenseRepostiory;
import com.michaelm.driverlicense.repositories.PersonRepository;

@Service
public class DMVService {
	@Autowired
	private PersonRepository pRepo;
	@Autowired
	private LicenseRepostiory lRepo;
	
	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}
	public Person getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Person> getAllPeople(){
		return this.pRepo.findAll();
	}
	public List<Person> getUnlicensedPeople(){
		return this.pRepo.findByLicenseIdIsNull();
	}
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(license);
	}
	public int generateLicenseNumber() {
		License l = this.lRepo.findTopByOrderByNumberDesc();
		if(l == null) {
			return 1;
		}
		int perviousLicenseNumber = l.getNumber();
		perviousLicenseNumber++;
		return(perviousLicenseNumber);
	}

}
