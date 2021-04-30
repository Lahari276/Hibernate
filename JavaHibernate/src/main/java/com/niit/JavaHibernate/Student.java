package com.niit.JavaHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name = "student_table")
public class Student {
	@Id
	int id;
	//@Transient
	StudentName name;
	//@Column(name = "trimester")
	int sem;
	int avg;
	
	public  Student() {}

	public Student(int id, int semester, int average,StudentName sname) {
		super();
		this.id = id;
		this.sem = semester;
		this.avg = average;
		this.name = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+avg;
	}
	

}