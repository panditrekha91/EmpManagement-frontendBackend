package com.Aspire.EmployeeManager.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empid;
	
	@NotBlank(message="name should not empty")
	private String name;
	
	@NotBlank(message="address should not empty")
	private String address;
	
	
	private double salary;
	
	@Email(message="emailid should not empty")
	private String emailid;
	
	@NotBlank(message="password should not empty")
	private String password;
	
	
	
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(long empid, String name, String address, double salary, String emailid, String password) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.emailid = emailid;
		this.password = password;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", emailid=" + emailid + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
