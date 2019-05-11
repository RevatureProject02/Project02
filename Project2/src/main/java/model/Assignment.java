package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Assignment 
{
	@Id
	@Column(name="ass_id")
	@SequenceGenerator(sequenceName="assignment_seq",name="ass_seq")
	@GeneratedValue(generator="ass_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column
	private float grade;
	
	@Column
	private String name;

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assignment(float grade, String name) {
		super();
		this.grade = grade;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
