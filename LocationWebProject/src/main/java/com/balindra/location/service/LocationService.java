package com.balindra.location.service;

import java.util.List;

import com.balindra.location.entity.Location;

public interface LocationService {
	Location getLocationById(int id);
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	List<Location> getAllLocations();
	void deleteLocation(int id);
	

}
