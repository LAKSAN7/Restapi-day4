package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentTable")
public class StudentEntity {
@Id
private int id;
private int age;
private String name;
private String dept;

public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}


}