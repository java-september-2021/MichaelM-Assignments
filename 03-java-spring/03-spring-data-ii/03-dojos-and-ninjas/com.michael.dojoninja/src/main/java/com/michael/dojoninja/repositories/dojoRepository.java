package com.michael.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.dojoninja.models.Dojo;
@Repository
public interface dojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findall();

}
