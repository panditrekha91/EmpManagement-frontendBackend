package com.Aspire.ExceptionHandlingDemo.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	 @NotBlank(message = "username shouldn't be null")
	private String username;
	
	 @Email(message = "invalid email address")
	private String email;
	
	 @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mob;
	 
	private String gender;
	
	@Min(18)
	    @Max(60)
	private int age;
	
	 @NotBlank
	private String nationality;
	
	
	
	
	public User() {
		super();
	}
	public User(int id, String username, String email, String mob, String gender, int age, String nationality) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.mob = mob;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", mob=" + mob + ", gender=" + gender
				+ ", age=" + age + ", nationality=" + nationality + "]";
	}
	
	
	
}
