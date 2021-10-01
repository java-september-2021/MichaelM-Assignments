package com.michael.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.dojoninja.models.Ninja;

@Repository
public interface ninjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();

}
