package com.example.demo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface uuidrepo extends JpaRepository<UUIDClass, Integer>{
	
}
