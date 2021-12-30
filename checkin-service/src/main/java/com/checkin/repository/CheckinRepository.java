package com.checkin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.checkin.model.Checkin;

@Repository
public interface CheckinRepository extends MongoRepository<Checkin, Integer> {

}
