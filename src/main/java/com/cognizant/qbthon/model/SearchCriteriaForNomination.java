package com.cognizant.qbthon.model;

public class SearchCriteriaForNomination {

	private String eventDate;
	
	private String eventName;
	
	private String[] eventSkills;
	
	private String eventSlot;

	public SearchCriteriaForNomination() {
		super();
	}

	public SearchCriteriaForNomination(String eventDate, String eventName, String[] eventSkills, String eventSlot) {
		super();
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.eventSkills = eventSkills;
		this.eventSlot = eventSlot;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String[] getEventSkills() {
		return eventSkills;
	}

	public void setEventSkills(String[] eventSkills) {
		this.eventSkills = eventSkills;
	}

	public String getEventSlot() {
		return eventSlot;
	}

	public void setEventSlot(String eventSlot) {
		this.eventSlot = eventSlot;
	}
	
}