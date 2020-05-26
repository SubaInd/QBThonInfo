package com.cognizant.qbthon.model;

import java.time.LocalDate;

public class SearchCriteriaForEvents {

	private int days;
	
	private String eventStartDate;
	
	private String eventEndDate;
	
	private String skills[];

	public SearchCriteriaForEvents() {
		super();
	}
		
	
	public SearchCriteriaForEvents(int days, String eventStartDate, String eventEndDate, String[] skills) {
		super();
		this.days = days;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.skills = skills;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	public String getEventStartDate() {
		return eventStartDate;
	}


	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}


	public String getEventEndDate() {
		return eventEndDate;
	}


	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

}
