package com.michael.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.dojoninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	
}
