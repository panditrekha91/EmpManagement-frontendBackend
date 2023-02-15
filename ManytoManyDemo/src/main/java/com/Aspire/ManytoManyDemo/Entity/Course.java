package com.Aspire.ManytoManyDemo.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Course {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cid;
	private String title;
	private double fees;
	
	@ManyToMany(mappedBy="courses", fetch=FetchType.LAZY)
	@JsonBackReference
	private Set<Student> students;

	
	
	
	public Course() {
		super();
	}

	public Course(int cid, String title, double fees, Set<Student> students) {
		super();
		this.cid = cid;
		this.title = title;
		this.fees = fees;
		this.students = students;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", title=" + title + ", fees=" + fees + ", students=" + students + "]";
	}
	
	
	
}
