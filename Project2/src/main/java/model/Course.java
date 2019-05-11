package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.api.client.util.DateTime;

@Entity
@Table(name="Course")
public class Course implements Serializable
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
	
	@Column(name="c_days")
	private String days;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name="Course_Assignment_jt",
	joinColumns = @JoinColumn(name = "c_id"),
	inverseJoinColumns=@JoinColumn(name="a_id"))
	private List<Assignment> assignments;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Course(String name, DateTime time, String location, String days) {
		super();
		this.name = name;
		this.time = time;
		this.location = location;
		this.days = days;
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

	public String getLocation() {
		return location;
	}

	public DateTime getTime() {
		return time;
	}

	public String getDays() {
		return days;
	}


	
	
}
