package com.isaalves.viagemcerta.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.isaalves.viagemcerta.entities.Location;
import com.isaalves.viagemcerta.repositories.LocationRepository;

@ExtendWith(SpringExtension.class)
public class LocationServiceTest {
	
	@InjectMocks
	LocationService locationService;
	
	@Mock
	LocationRepository locationRepository;

	@Test
	public void searchShouldFindLocationByName() {
		Location expectedLocation = new Location(1L, "Fortaleza");
		
		String name = "Fortaleza";
		
		Location resultLocation = locationService.findLocationByName(name);
		Assertions.assertEquals(expectedLocation, resultLocation);
		
	}
	
	@BeforeEach
	void setUp() {
		Location locationModel = new Location(1L, "Fortaleza");
		
		Mockito.when(locationRepository.findByName(locationModel.getName()))
			   .thenReturn(locationModel);
	}
}
