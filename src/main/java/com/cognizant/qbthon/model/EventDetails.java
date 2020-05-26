package com.cognizant.qbthon.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Event_Details")
public class EventDetails {
	
	private String eventId;
	
	private String eventName;
	
	private LocalDate eventDate;
	
	private String eventSlot;
	
	private String eventstartTime;
	
	private String eventEndTime;
	
	private List<String> eventSkills;
	
	private List<String> associateList;
	
	private List<String> smeList;
	
	private Integer totalNoOfSkillsCovered;
	
	private Integer totalNoOfMCQs;
	
	private List<String> voucherWinners;
	
	public EventDetails() {
		super();
	}

	
	public EventDetails(String eventId, String eventName, LocalDate eventDate, String eventSlot, String eventstartTime,
			String eventEndTime, List<String> eventSkills, List<String> associateList, List<String> smeList,
			Integer totalNoOfSkillsCovered, Integer totalNoOfMCQs, List<String> voucherWinners) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventSlot = eventSlot;
		this.eventstartTime = eventstartTime;
		this.eventEndTime = eventEndTime;
		this.eventSkills = eventSkills;
		this.associateList = associateList;
		this.smeList = smeList;
		this.totalNoOfSkillsCovered = totalNoOfSkillsCovered;
		this.totalNoOfMCQs = totalNoOfMCQs;
		this.voucherWinners = voucherWinners;
	}


	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventSlot() {
		return eventSlot;
	}

	public void setEventSlot(String eventSlot) {
		this.eventSlot = eventSlot;
	}

	public List<String> getEventSkills() {
		return eventSkills;
	}

	public void setEventSkills(List<String> eventSkills) {
		this.eventSkills = eventSkills;
	}

	public List<String> getAssociateList() {
		return associateList;
	}

	public void setAssociateList(List<String> associateList) {
		this.associateList = associateList;
	}

	public List<String> getSmeList() {
		return smeList;
	}

	public void setSmeList(List<String> smeList) {
		this.smeList = smeList;
	}

	public Integer getTotalNoOfSkillsCovered() {
		return totalNoOfSkillsCovered;
	}

	public void setTotalNoOfSkillsCovered(Integer totalNoOfSkillsCovered) {
		this.totalNoOfSkillsCovered = totalNoOfSkillsCovered;
	}

	public Integer getTotalNoOfMCQs() {
		return totalNoOfMCQs;
	}

	public void setTotalNoOfMCQs(Integer totalNoOfMCQs) {
		this.totalNoOfMCQs = totalNoOfMCQs;
	}

	public List<String> getVoucherWinners() {
		return voucherWinners;
	}

	public void setVoucherWinners(List<String> voucherWinners) {
		this.voucherWinners = voucherWinners;
	}


	public String getEventstartTime() {
		return eventstartTime;
	}


	public void setEventstartTime(String eventstartTime) {
		this.eventstartTime = eventstartTime;
	}


	public String getEventEndTime() {
		return eventEndTime;
	}


	public void setEventEndTime(String eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

}
