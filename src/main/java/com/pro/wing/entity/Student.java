package com.pro.wing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="std_id")
	int Id;
	@Column(name="std_name")
	String name;
	@Column(name="std_city")
	String city;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String name, String city) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
