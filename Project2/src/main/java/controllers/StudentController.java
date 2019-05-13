package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Student;
import services.StudentServices;

@Controller
@CrossOrigin
@RequestMapping("/student")
public class StudentController 
{
	
	//@Autowired
	//Service s;
	//Replace this with the service class

	// this works the same way
	// @GetMapping("/all")
		//@RequestMapping(value = "/url", method = Requestmethod.GET / POST)
		//public ResponseEntity<ReturnObject> getstuff(@PathVariable key)
		//return new ResponseEntity<ReturnObject>(repository.method(), HttpStatus.value)
		/*
		 * url can also hold values using {} as an example
		 * /{id} is a url that is an id
		 */
	
	@Autowired
	StudentServices ss;
	
	//Searching for all 
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return new ResponseEntity<List<Student>>(ss.getAllStudents(),HttpStatus.OK);
	}
	//Getting 1 by Id
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Student> getStudentById(@PathVariable int id)
	{
		return new ResponseEntity<Student>(ss.getStudentById(id),HttpStatus.OK);
	}
	//Delete a user
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public void deleteStudentById(@PathVariable int id)
	{
		ss.deleteStudentById(id);
	}
	//Insert
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	@ResponseBody
	public void addStudent(@RequestBody Student s)
	{
		ss.addStudent(s);
	}
	//update
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	public void updateStudent(@RequestBody Student s)
	{
		ss.updateStudent(s);
	}
	
}