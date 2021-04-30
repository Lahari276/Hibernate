package com.niit.JavaHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "student_table")
public class Student {
	@Id
	int id;
	//@Transient
	String name;
	@Column(name = "trisemester")
	int sem;
	int avg;
	
	public  Student() {}

	public Student(int id, String name, int semester, int average) {
		super();
		this.id = id;
		this.name = name;
		this.sem = semester;
		this.avg = average;
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
	public int getSemester() {
		return sem;
	}
	public void setSemester(int semester) {
		this.sem = semester;
	}
	public int getAverage() {
		return avg;
	}
	public void setAverage(int average) {
		this.avg = average;
	}
	
	

}