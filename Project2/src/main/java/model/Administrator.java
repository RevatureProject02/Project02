package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Administrator")
public class Administrator implements Serializable
{
	@Id
	@Column(name="ad_id")
	@SequenceGenerator(sequenceName="administrator_seq",name="ad_seq")
	@GeneratedValue(generator="ad_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="ad_name")
	private String name;
	
	@Column(name="ad_age")
	private int age;
	
	@Column(name="ad_username")
	private String username;
	
	@Column(name="ad_password")
	private String password;
	
	@Pattern(regexp="\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}")
	@Column(name="ad_email")
	private String email;

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(String name, int age, String username, String password, String email) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Administrator(int id, String name, int age, String username, String password, String email) {
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
		return "Administrator [id=" + id + ", name=" + name + ", age=" + age + ", username=" + username + ", password="
				+ password + ", email=" + email + "]";
	}
	
	
	

}
