package com.isaalves.viagemcerta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaalves.viagemcerta.entities.Location;
import com.isaalves.viagemcerta.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	public Location findLocationByName(String name) {
		return this.locationRepository.findByName(name);
	}
}
