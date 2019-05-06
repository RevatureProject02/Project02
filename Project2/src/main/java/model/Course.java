package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.api.client.util.DateTime;

@Entity
@Table(name="Course")
public class Course 
{
	@Id
	@Column(name="c_id")
	@SequenceGenerator(sequenceName="course_seq",name="c_seq")
	@GeneratedValue(generator="c_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_time")
	private DateTime time;
	
	@Column(name="c_location")
	private String location;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name) {
		super();
		this.name = name;
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}
