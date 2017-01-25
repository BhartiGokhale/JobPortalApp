package com.cybage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobApplicantDetails")
public class JobApplicant {
	
	 @Id
	    @Column(name = "applicantId")
	    private int id;
	 
	 @Column(name = "aName")
	    private String name;
	 
	 @Column(name = "aQualification")
	    private String qual;
	 
	 @Column(name = "aExperience")
	    private String exp;
	 
	 @Column(name = "aPhoneNum")
	    private int phn;
	 
	 @Column(name = "aEmail")
	    private String email;

	 //default constructor
	 public JobApplicant() {
		//this is default constructor 	
		
		}
	 
	public JobApplicant(int id, String name, String qual, String exp, int phn, String email) {
		super();
		this.id = id;
		this.name = name;
		this.qual = qual;
		this.exp = exp;
		this.phn = phn;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
