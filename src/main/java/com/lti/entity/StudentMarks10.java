package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq1", sequenceName = "studseq", initialValue = 1, allocationSize = 100)
@Table(name = "STUDENTMARKS_10")
public class StudentMarks10 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
	private int student10Id;
	
	private String rollnumber;
	
	private String boardname;
	
	private int passingyear;
	
	private double percentage;
	
	private long studentId;
	
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	

	@OneToOne
	@JoinColumn(name="studentId", insertable = false, updatable = false)
	private StudentRegistration studentRegistration;


	public int getStudent10Id() {
		return student10Id;
	}

	public void setStudent10Id(int student10Id) {
		this.student10Id = student10Id;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	
	
}
