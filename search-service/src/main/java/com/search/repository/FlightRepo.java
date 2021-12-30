package com.search.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.search.model.Flight;

@Repository
public interface FlightRepo extends MongoRepository<Flight,String> {
	
	@Query("{'source' : ?0, 'destination' : ?1, 'departure_date' : ?2}")
	List<Flight> findByLocation(String source, String destination, String departure_date);	

}
