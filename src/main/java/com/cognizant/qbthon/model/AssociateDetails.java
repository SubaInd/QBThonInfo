package com.cognizant.qbthon.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Associate_Details")
public class AssociateDetails {
	
	private String associateId;
	
	private String associateName;
	
	private String buName;
	
	private String accountName;
	
	private String grade;
	
	private List<String> skillList;
	
	private String role;
	
	private LocalDate createdDate;

	
	public AssociateDetails() {
		super();
	}

	public AssociateDetails(String associateId, String associateName, String buName, String accountName, String grade,
			List<String> skillList, String role, LocalDate createdDate) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.buName = buName;
		this.accountName = accountName;
		this.grade = grade;
		this.skillList = skillList;
		this.role = role;
		this.createdDate = createdDate;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public List<String> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
}
