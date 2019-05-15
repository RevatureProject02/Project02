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
@Table(name="Professor")
public class Professor implements Serializable
{
	@Id
	@Column(name="p_id")
	@SequenceGenerator(sequenceName="professor_seq",name="p_seq")
	@GeneratedValue(generator="p_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="p_age")
	private int age;
	
	@Column(name="p_username",unique=true)
	private String username;
	
	@Column(name="p_password")
	private String password;
	
	@Pattern(regexp="\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}")
	@Column(name="p_email")
	private String email;
	
	@Column(name="p_office")
	private int office;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany()
	@JoinTable(name="professor_course_jt",
	joinColumns = @JoinColumn(name="p_id"),
	inverseJoinColumns=@JoinColumn(name="c_id"))
	private List<Course> Courses;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public Professor(String name, int age, String username, String password, String email, int office) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
		this.office = office;
	}





	public Professor(int id, String name, int age, String username, String password, String email, int office) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
		this.office = office;
	}

	

	public int getOffice() {
		return office;
	}


	public void setOffice(int office) {
		this.office = office;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Course> getCourses() {
		return Courses;
	}


	public void setCourses(List<Course> courses) {
		Courses = courses;
	}


	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", age=" + age + ", username=" + username + ", password="
				+ password + ", email=" + email + ", Courses=" + Courses + "]";
	}

	
	
	
}
