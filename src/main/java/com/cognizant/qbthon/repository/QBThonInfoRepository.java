package com.cognizant.qbthon.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.qbthon.model.EventDetails;

@Repository
public interface QBThonInfoRepository extends MongoRepository<EventDetails, String> {

}
