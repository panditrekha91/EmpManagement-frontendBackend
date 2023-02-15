package com.Aspire.ManytoManyDemo.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String name;
	private String department;
	private int age;
	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="Studentcoursetable",
	
			joinColumns= { @JoinColumn(name="studid", referencedColumnName="sid")},
			inverseJoinColumns= {@JoinColumn(name="courseid", referencedColumnName="cid")}		
			)
	@JsonManagedReference
	private Set<Course> courses;

	

	public Student() {
		super();
	}


	public Student(int sid, String name, String department, int age, Set<Course> courses) {
		super();
		this.sid = sid;
		this.name = name;
		this.department = department;
		this.age = age;
		this.courses = courses;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", department=" + department + ", age=" + age + ", courses="
				+ courses + "]";
	}
	
	
	
	
	
}
