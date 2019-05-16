package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Assignment;
import model.Course;
import model.Student;
import services.AssignmentServices;
import services.CourseServices;
import services.Encryptor;
import services.StudentServices;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*", value = "*")
@RequestMapping("student")
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
	@PostMapping(value="/addCourse")
	@ResponseBody
	public void addCourse(@RequestBody Course course, @RequestBody Student student)
	{
		ss.addCourse(course, student);
		
	}
	//JSON TEST INSERT
	//@RequestMapping(value = "/addJSON",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
//	@PostMapping(value = "/addJSON")
//	@ResponseBody
//	public String handleJSONAdd(@RequestBody @Valid Student s, Errors errors)
//	{
//		if(errors.hasErrors())
//		{
//			for(ObjectError e: errors.getAllErrors())
//				System.err.println(e);
//			return "Student is invalid";
//		}
//		try {
//			ss.addStudent(s);
//			return "Student added!";
//		}
//		catch (Exception e)
//		{
//			return "Student creation Failed!";
//		}
//	}
	//Insert
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	@ResponseBody
	public void addStudent(@RequestBody Student s)
	{
		s.setPassword(new Encryptor().Encrypt(s.getPassword()));
		ss.addStudent(s);
	}
	//update
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	public void updateStudent(@RequestBody Student s)
	{
		ss.updateStudent(s);
	}
	//Get all courses of this student
	@RequestMapping(value = "/courseList", method = RequestMethod.GET)
	public List<Course> getCoursesOfStudent(@RequestBody Student s)
	{
		return new CourseServices().getAllCoursesOfStudent(s);
	}	
	
}
