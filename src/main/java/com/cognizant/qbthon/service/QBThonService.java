package com.cognizant.qbthon.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.cognizant.qbthon.model.AssociateDetails;
import com.cognizant.qbthon.model.EventDetails;
import com.cognizant.qbthon.model.SearchCriteriaForEvents;
import com.cognizant.qbthon.model.SearchCriteriaForNomination;
import com.cognizant.qbthon.repository.QBThonInfoRepository;

@Service
public class QBThonService {
	
	@Autowired
	private QBThonInfoRepository qbThonInfoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public List<AssociateDetails> createAssociates() {
		List<AssociateDetails> associateDetails = new ArrayList<AssociateDetails>();
		
		List<String> skills1 = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle"));
		AssociateDetails associateDetail1 = new AssociateDetails("705196", "LalithaaParkavi", "Insurance", "Country Financial", "Associate", skills1, "USER", LocalDate.now());
		associateDetails.add(associateDetail1);
		
		List<String> skills11 = new ArrayList<String>(Arrays.asList("Java", "Spring Boot", "Oracle"));
		AssociateDetails associateDetail11 = new AssociateDetails("567896", "User1", "AAA", "BBB", "PA", skills11, "USER", LocalDate.now());
		associateDetails.add(associateDetail11);
		
		List<String> skills12 = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle"));
		AssociateDetails associateDetail12 = new AssociateDetails("789452", "User2", "AAA", "BBB", "PA", skills12, "USER", LocalDate.now());
		associateDetails.add(associateDetail12);
		
		List<String> skills13 = new ArrayList<String>(Arrays.asList("React", ".Net","Jasmine"));
		AssociateDetails associateDetail13 = new AssociateDetails("968574", "User3", "AAA", "BBB", "PA", skills13, "USER", LocalDate.now());
		associateDetails.add(associateDetail13);
		
		List<String> skills14 = new ArrayList<String>(Arrays.asList("Java", "Jasmine", "Spring Boot", "My SQL"));
		AssociateDetails associateDetail14 = new AssociateDetails("326547", "User4", "AAA", "BBB", "PA", skills14, "USER", LocalDate.now());
		associateDetails.add(associateDetail14);
		
		List<String> skills2 = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle", "AWS", "NoSQL"));
		AssociateDetails associateDetail2 = new AssociateDetails("123456", "ADMIN", "Test", "Test", "Manager", skills2, "ADMIN", LocalDate.now());
		associateDetails.add(associateDetail2);
		
		List<String> skills3 = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle", "AWS", "NoSQL", "Kafka"));
		AssociateDetails associateDetail3 = new AssociateDetails("789101", "SME", "Test", "Test", "Architect", skills3, "SME", LocalDate.now());
		associateDetails.add(associateDetail3);
		
		List<String> skills31 = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle", "AWS", "NoSQL", "Kafka"));
		AssociateDetails associateDetail31 = new AssociateDetails("875489", "SME1", "Test", "Test", "Manager", skills31, "SME", LocalDate.now());
		associateDetails.add(associateDetail31);
		
		List<String> skills32 = new ArrayList<String>(Arrays.asList("Jasmine", "React", ".Net", "My SQL"));
		AssociateDetails associateDetail32 = new AssociateDetails("564289", "SME2", "Test", "Test", "Manager", skills32, "SME", LocalDate.now());
		associateDetails.add(associateDetail32);
		
		List<String> skills33 = new ArrayList<String>(Arrays.asList("Jasmine", "React", ".Net", "My SQL"));
		AssociateDetails associateDetail33 = new AssociateDetails("234567", "SME3", "Test", "Test", "Architect", skills33, "SME", LocalDate.now());
		associateDetails.add(associateDetail33);
		
		return (List<AssociateDetails>) mongoTemplate.insertAll(associateDetails);
	}
	
	public List<EventDetails> createEvents() {
		List<EventDetails> eventDetails = new ArrayList<EventDetails>();
		
		List<String> eventSkills = new ArrayList<String>(Arrays.asList("Java", "Angular", "Spring Boot", "Oracle"));
		List<String> associateList = new ArrayList<String>(Arrays.asList("705196", "567896", "789452"));
		List<String> smeList =  new ArrayList<String>(Arrays.asList("789101", "875489"));
		List<String> voucherWinners = new ArrayList<String>(Arrays.asList("705196", "789452"));
		EventDetails eventDetail = new EventDetails("001", "QBThon_June_001", LocalDate.now().plusDays(9), "10:00 AM", "01.00 PM", "Morning", eventSkills, associateList, smeList, 4, 50, voucherWinners);
		eventDetails.add(eventDetail);
		
		eventSkills = new ArrayList<String>(Arrays.asList("Jasmine", "React", ".Net", "My SQL"));
		associateList = new ArrayList<String>(Arrays.asList("968574", "326547"));
		smeList =  new ArrayList<String>(Arrays.asList("564289", "234567"));
		voucherWinners = new ArrayList<String>(Arrays.asList("968574", "326547"));
		eventDetail = new EventDetails("002", "QBThon_June_002", LocalDate.now().plusDays(12), "03:00 PM", "06:00 PM", "Evening", eventSkills, associateList, smeList, 4, 50, voucherWinners);
		eventDetails.add(eventDetail);
		
		eventSkills = new ArrayList<String>(Arrays.asList("Jasmine", "VueJS", ".Net", "My SQL", "Docker"));
		associateList = new ArrayList<String>(Arrays.asList("968574", "326547"));
		smeList =  new ArrayList<String>(Arrays.asList("564289", "234567"));
		voucherWinners = new ArrayList<String>(Arrays.asList("968574", "326547"));
		eventDetail = new EventDetails("003", "QBThon_June_003", LocalDate.now().plusDays(30), "03:00 PM", "06:00 PM", "Evening", eventSkills, associateList, smeList, 4, 50, voucherWinners);
		eventDetails.add(eventDetail);
		
		return (List<EventDetails>) mongoTemplate.insertAll(eventDetails);
	}
	
	public List<EventDetails> getQBThonInfoDetails(SearchCriteriaForEvents searchCriteria) {
		LocalDate currentDate = LocalDate.now();
		Query query = new Query();
		
		if(0 != searchCriteria.getDays())
			query.addCriteria(Criteria.where("eventDate").gte(currentDate).lt(currentDate.plusDays(searchCriteria.getDays())));
			
		if(null != searchCriteria.getEventStartDate() && !searchCriteria.getEventStartDate().isEmpty() 
				&& null != searchCriteria.getEventEndDate() && !searchCriteria.getEventEndDate().isEmpty()) {
			System.out.println("EventDate "+searchCriteria.getEventStartDate() + " "+searchCriteria.getEventEndDate().isEmpty());
			query.addCriteria(Criteria.where("eventDate").gte(LocalDate.parse(searchCriteria.getEventStartDate())).lt(LocalDate.parse(searchCriteria.getEventEndDate())));
		}
			
		
		if(0 < searchCriteria.getSkills().length) {
			System.out.println(searchCriteria.getSkills().length);
			query.addCriteria(Criteria.where("eventSkills").in(searchCriteria.getSkills()));
		}
			
			System.out.println("Query => " +query);
				
		return mongoTemplate.find(query, EventDetails.class);
		
	}
	
	public List<String> getSkillsList() {
		return mongoTemplate.findDistinct("eventSkills", EventDetails.class, String.class);
	}
	
	public List<String> getDistinctEventNames(String date) {
		Query query = new Query();
		
		if(null != date) {
			query.addCriteria(Criteria.where("eventDate").gte(LocalDate.parse(date)));
		}
		return mongoTemplate.findDistinct(query, "eventName", EventDetails.class, String.class);
	}
	
	public List<EventDetails> getEventDetailsByEventName(String eventName) {
		Query query = new Query();
		
		if(null != eventName && eventName != "") {
			System.out.println("Event Name =>"+eventName);
			query.addCriteria(Criteria.where("eventName").is(eventName));
		}
		
		System.out.println(query);
		
		return mongoTemplate.find(query, EventDetails.class);
		
	}

	public List<String> getAssocIdList(String[] eventSkills) {
		Query query = new Query();
		if(0 < eventSkills.length) {
			System.out.println(eventSkills.length);
			query.addCriteria(Criteria.where("skillList").in(eventSkills));
		}
		return mongoTemplate.findDistinct(query, "associateId", AssociateDetails.class, String.class);
	}

	public EventDetails createEvent(EventDetails eventDet) {
		return qbThonInfoRepository.insert(eventDet);
	}
}
