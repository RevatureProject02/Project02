package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="Student")
public class Student implements Serializable
{
	@Id
	@Column(name="s_id")
	@SequenceGenerator(sequenceName="student_seq",name="s_seq")
	@GeneratedValue(generator="s_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="s_name")
	private String name;
	
	@Column(name="s_age")
	private int age;
	
	@Column(name="s_username")
	private String username;
	
	@Column(name="s_password")
	private String password;
	
	@Pattern(regexp="\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}")
	@Column(name="s_email")
	private String email;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany()
	@JoinTable(name="student_course_jt",
	joinColumns = @JoinColumn(name = "s_id"),
	inverseJoinColumns=@JoinColumn(name="c_id"))
	private List<Course> Courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age, String username, String password, String email) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public Student(int id, String name, int age, String username, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Course> getCourses() {
		return Courses;
	}

	public void setCourses(List<Course> courses) {
		Courses = courses;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", username=" + username + ", password="
				+ password + ", email=" + email + ", Courses=" + Courses + "]";
	}
	
	
}