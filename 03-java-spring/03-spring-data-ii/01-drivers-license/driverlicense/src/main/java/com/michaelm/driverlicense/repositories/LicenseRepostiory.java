package com.michaelm.driverlicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.michaelm.driverlicense.models.License;

public interface LicenseRepostiory extends CrudRepository<License, Long> {
	List<License> findAll();
	License findTopByOrderByNumberDesc();
}
