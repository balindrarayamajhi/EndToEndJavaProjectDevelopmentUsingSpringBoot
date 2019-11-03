package com.balindra.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.balindra.location.entity.Location;
import com.balindra.location.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
	
	@Autowired
	private LocationService locservice;
	
	@GetMapping("/all")
	public List<Location> getAllLocations(){
		return locservice.getAllLocations();
		
	}
	
	@PostMapping("/location")
	public Location createLocation(@RequestBody Location location) {
		return locservice.saveLocation(location);
		
	}
	
	@PutMapping("/location")
	public Location updateLocation(@RequestBody Location location) {
		return locservice.updateLocation(location);
		
	}
	
	@DeleteMapping("/location")
	public void deleteLocation(@RequestParam("id")int id) {
		locservice.deleteLocation(id);
		
	}
	
	@GetMapping("/one")
	public Location getOne(int id) {
		return locservice.getLocationById(id);
	}

}
