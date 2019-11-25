package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCHEMES_MASTER")
public class Schemes_Master {

	@Id
	@GeneratedValue
	private int scheme_Id;
	
	private String scheme_Name;
	
	private String scheme_Description;

	public int getScheme_Id() {
		return scheme_Id;
	}

	public void setScheme_Id(int scheme_Id) {
		this.scheme_Id = scheme_Id;
	}

	public String getScheme_Name() {
		return scheme_Name;
	}

	public void setScheme_Name(String scheme_Name) {
		this.scheme_Name = scheme_Name;
	}

	public String getScheme_Description() {
		return scheme_Description;
	}

	public void setScheme_Description(String scheme_Description) {
		this.scheme_Description = scheme_Description;
	}
	
	
	
	
}
