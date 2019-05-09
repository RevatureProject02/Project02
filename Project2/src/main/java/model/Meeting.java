package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.api.client.util.DateTime;

@Entity
@Table(name="Meeting")
public class Meeting {
	
	@Id
	@Column(name="m_id")
	@SequenceGenerator(sequenceName="meeting_seq",name="m_seq")
	@GeneratedValue(generator="m_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="m_summary")
	private String summary;
	
	@Column(name="m_time")
	private DateTime time;
	
	@Column (name="m_location")
	private String location;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="meeting_advisor_jt",
	joinColumns=@JoinColumn(name="m_id"),
	inverseJoinColumns=@JoinColumn(name="adv_id")) 
	private List<Advisor> advisors;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="meeting_professor_jt",
	joinColumns=@JoinColumn(name="m_id"),
	inverseJoinColumns=@JoinColumn(name="p_id")) 
	private List<Professor> professors;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="meeting_student_jt",
	joinColumns=@JoinColumn(name="m_id"),
	inverseJoinColumns=@JoinColumn(name="s_id")) 
	private List<Student> students;

	public Meeting(int id, String summary, DateTime time, String location, List<Advisor> advisors,
			List<Professor> professors, List<Student> students) {
		super();
		this.id = id;
		this.summary = summary;
		this.time = time;
		this.location = location;
	}

	public Meeting(String summary, DateTime time, String location, List<Advisor> advisors, List<Professor> professors,
			List<Student> students) {
		super();
		this.summary = summary;
		this.time = time;
		this.location = location;
	}

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", summary=" + summary + ", time=" + time + ", location=" + location
				+ ", advisors=" + advisors + ", professors=" + professors + ", students=" + students + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public DateTime getTime() {
		return time;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Advisor> getAdvisors() {
		return advisors;
	}

	public void setAdvisors(List<Advisor> advisors) {
		this.advisors = advisors;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	


}
