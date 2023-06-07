package com.isaalves.viagemcerta.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaalves.viagemcerta.entities.Location;
import com.isaalves.viagemcerta.repositories.LocationRepository;

@RestController
@RequestMapping(value = "/locations")
public class LocationResource {
	
	@Autowired
	private LocationRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Location>> findAll() {
		return ResponseEntity.ok().body(this.repository.findAll());
	}
}
