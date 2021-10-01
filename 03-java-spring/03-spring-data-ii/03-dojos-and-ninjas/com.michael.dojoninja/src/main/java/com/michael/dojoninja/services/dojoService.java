package com.michael.dojoninja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dojoninja.models.Dojo;
import com.michael.dojoninja.repositories.dojoRepository;
import com.michael.dojoninja.repositories.ninjaRepository;

@Service
public class dojoService {
	@Autowired
	private dojoRepository dRepo;
	@Autowired
	private ninjaRepository nRepo;
	
	public Dojo createDojo(Dojo newDojo) {
		return this.dRepo.save(newDojo);
	}
}
