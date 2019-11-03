package com.balindra.location.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balindra.location.entity.Location;
import com.balindra.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locRepo;
	
	@Override
	public Location getLocationById(int id) {
		Optional<Location> location=locRepo.findById(id);
		if(location.isPresent())
			return location.get();
		
		throw new RuntimeException("Location with Id : "+id+" does not exists");
	}

	@Override
	public Location saveLocation(Location location) {
		return locRepo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locRepo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locRepo.delete(location);
		
	}

	@Override
	public List<Location> getAllLocations() {
		return locRepo.findAll();
	}

	@Override
	public void deleteLocation(int id) {
		locRepo.deleteById(id);
		
	}

}
