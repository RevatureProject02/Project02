package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Advisor")
public class Advisor 
{
	@Id
	@Column(name="adv_id")
	@SequenceGenerator(sequenceName="advisor_seq",name="adv_seq")
	@GeneratedValue(generator="adv_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="adv_name")
	private String name;
	
	@Column(name="adv_age")
	private int age;
	
	@Column(name="adv_username")
	private String username;
	
	@Column(name="adv_password")
	private String password;
	
	@Column(name="adv_email")
	private String email;

	
	public Advisor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Advisor(String name, int age, String username, String password, String email) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	

	public Advisor(int id, String name, int age, String username, String password, String email) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Advisor [id=" + id + ", name=" + name + ", age=" + age + ", username=" + username + ", password="
				+ password + ", email=" + email + "]";
	}
	
	
	
}
