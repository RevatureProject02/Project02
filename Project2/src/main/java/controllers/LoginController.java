package controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Administrator;
import model.Advisor;
import model.Professor;
import model.Student;
import model.User;
import services.AdministratorServices;
import services.AdvisorServices;
import services.Encryptor;
import services.ProfessorServices;
import services.StudentServices;

@RestController
@RequestMapping(value = "/loginController")
@CrossOrigin(origins = "*", allowedHeaders = "*", value = "*")
public class LoginController {
	@Autowired
	StudentServices ss;
	@Autowired
	ProfessorServices ps;
	@Autowired
	AdvisorServices as;
	@Autowired
	AdministratorServices ads;


	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> handLogin(@RequestBody User u) {
		String Username = u.getUsername();
		String Password = new Encryptor().Encrypt(u.getPassword());
		String role = u.getRole();
		System.out.println(Username + " " + Password + " " + role);
		// This will go through until true (then that defines permissions)
		if (role.equals("student") && checkStudentList(Username, Password)) {
			System.out.println("student");
			return Collections.singletonMap("key", "Student");
		} else if (role.equals("professor") && checkProfessorList(Username, Password)) {
				System.out.println("prof");
				return Collections.singletonMap("key", "Professor");
		} else if (role.equals("advisor") && checkAdvisorList(Username, Password)) {
				System.out.println("Advisor");
				return Collections.singletonMap("key", "Advisor");
		} else if (role.equals("admin") && checkAdministratorList(Username, Password)) {
				System.out.println("admin");
				return Collections.singletonMap("key", "Administrator");
			} else {
				return Collections.singletonMap("key", "failed to obtain matching user");}

	}

	private boolean checkStudentList(String username, String password) {
		for (Student s : ss.getAllStudents()) {
			if (s.getUsername().equals(username)) {
				// Define the Session as a Student, hold onto this students information
				Student sessionStudent = s;
				if (s.getPassword().equals(password)) {
					// Allow login
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkProfessorList(String username, String password) {
		for (Professor p : ps.getAllProfessors()) {
			if (p.getUsername().equals(username)) {
				// Define the Session as a Professor, hold onto professor
				Professor sessionProfessor = p;
				if (p.getPassword().equals(password)) {
					// Allow Login
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkAdvisorList(String username, String password) {
		System.out.println("In checkAdvisorList");
		for (Advisor a : as.selectAllAdvisors())

		{
			System.out.println("advisor " + a.getUsername());
			if (a.getUsername().equals(username))
				System.out.println("found advisor");
			{
				// Define the Session as an advisor, hold onto the advisor
				Advisor sessionAdvisor = a;
				if (a.getPassword().equals(password)) {
					System.out.println("matching advisor password");
					// Allow login
					return true;
				}
			}
		}
		return false;
	}
	// Once found, take the table name from that repsitory
	// Validate its the correct information (login is username/password)

	private boolean checkAdministratorList(String username, String password) {
		System.out.println("in check admin");
		for (Administrator a : ads.getAllAdministrators()) {
			System.out.println(a.getUsername());
			if (a.getUsername().equals(username))
				System.out.println("Found equal user");
			{
				// Define the Session as an administrator, hold onto the admin
				Administrator sessionAdministrator = a;
				if (a.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	// Once found, take the table name from that repsitory
	// Validate its the correct information (login is username/password)

}
