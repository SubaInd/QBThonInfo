package com.cognizant.qbthon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.qbthon.model.AssociateDetails;
import com.cognizant.qbthon.model.EventDetails;
import com.cognizant.qbthon.model.SearchCriteriaForEvents;
import com.cognizant.qbthon.model.SearchCriteriaForNomination;
import com.cognizant.qbthon.service.QBThonService;

@CrossOrigin
@RestController
@RequestMapping("/qbthonInfo")
public class QBThonInfoController {

	@Autowired
	private QBThonService qbThonService;
	
	@PostMapping("/createAssociates")
	public ResponseEntity<List<AssociateDetails>> createAssociates() {
		return ResponseEntity.status(HttpStatus.CREATED).body(qbThonService.createAssociates());
		
	}
	
	@PostMapping("/createEvents")
	public ResponseEntity<List<EventDetails>> createEvents() {
		return ResponseEntity.status(HttpStatus.CREATED).body(qbThonService.createEvents());
		
	}
	
	@GetMapping("/getQBThonInfoDetails")
	public ResponseEntity<List<EventDetails>> getQBThonInfoDetails(SearchCriteriaForEvents searchCriteria) {
		return ResponseEntity.status(HttpStatus.OK).body(qbThonService.getQBThonInfoDetails(searchCriteria));
		
	} 
	
	@GetMapping("/getDistinctSkills")
	public ResponseEntity<List<String>> getDistinctSkills() {
		return ResponseEntity.status(HttpStatus.OK).body(qbThonService.getSkillsList());
	}
	
	@GetMapping("/getUpcomingEventNames")
	public ResponseEntity<List<String>> getDistinctEventNames(@RequestParam("date") String date) {
		return ResponseEntity.status(HttpStatus.OK).body(qbThonService.getDistinctEventNames(date));
	}
	
	@GetMapping("/getEventDetailsByEventName")
	public ResponseEntity<List<EventDetails>> getEventDetailsByEventName(@RequestParam("eventName") String eventName) {
		return ResponseEntity.status(HttpStatus.OK).body(qbThonService.getEventDetailsByEventName(eventName));
	}
	
}
