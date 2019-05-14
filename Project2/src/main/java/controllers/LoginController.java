package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Advisor;
import model.Professor;
import model.Student;
import services.AdvisorServices;
import services.ProfessorServices;
import services.StudentServices;

@Controller
public class LoginController 
{
	@Autowired
	StudentServices ss;
	@Autowired
	ProfessorServices ps;
	@Autowired
	AdvisorServices as;
	
	@RequestMapping ("/LoginServer")
	@ResponseBody
	public String handLogin(@RequestBody MultiValueMap<String,String> formParams)
	{
		String Username = formParams.getFirst("Username");
		String Password = formParams.getFirst("Password");
		//This will go through until true (then that defines permissions)
		if(checkStudentList(Username,Password))
			return "Student";
		if(checkProfessorList(Username,Password))
			return "Professor";
		if(checkAdvisorList(Username,Password))
			return "Advisor";
		
		return null;
	}
	private boolean checkStudentList(String username, String password)
	{
		for(Student s: ss.getAllStudents())
		{
			if(s.getUsername().equals(username))
			{
				//Define the Session as a Student, hold onto this students information
				Student sessionStudent = s;
				if(s.getPassword().equals(password))
				{
					//Allow login
					return true;
				}
				else
				{
					//Tell the user that they entered incorrect information
					return false;
				}
			}
		}
		return false;
	}
	private boolean checkProfessorList(String username, String password)
	{
		for(Professor p:ps.getAllProfessors())
		{
			if(p.getUsername().equals(username)) 
			{
				//Define the Session as a Professor, hold onto professor
				Professor sessionProfessor = p;
				if(p.getPassword().equals(password))
				{
					//Allow Login
					return true;
				}
				else
				{
					//Tell the user that they entered incorrect information
					return false;
				}
			}
		}
		return false;
	}
	private boolean checkAdvisorList(String username, String password)
	{
		for(Advisor a: as.selectAllAdvisors())
		{
			if(a.getUsername().equals(username))
			{
				//Define the Session as an advisor, hold onto the advisor
				Advisor sessionAdvisor = a;
				if(a.getPassword().equals(password))
				{
					//Allow login
					return true;
				}
				else
				{
					//Tell the user that they entered incorrect information
					return false;
				}
			}
		}
		return false;
	}
	//Once found, take the table name from that repsitory
	//Validate its the correct information (login is username/password)
	
}
