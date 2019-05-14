package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Course;
import services.CourseServices;

@Controller
@RequestMapping("course")
@CrossOrigin
public class CourseController {

	@Autowired
	CourseServices cs;

	@GetMapping(value = "/all")
	public ResponseEntity<List<Course>> getAllCourses() {
		return new ResponseEntity<List<Course>>(cs.getAllCourses(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable int id) {
		return new ResponseEntity<Course>(cs.getCourseById(id), HttpStatus.OK);
	}

	// Delete a user
	@DeleteMapping(value = "/delete/{id}")
	public void deleteCourseById(@PathVariable int id) {
		cs.deleteCourseById(id);
	}

	// Insert
	@PostMapping(value = "/add")
	@ResponseBody
	public void addCourse(@RequestBody Course c) {
		cs.addCourse(c);
	}

	// update
	@PutMapping(value = "/update")
	@ResponseBody
	public void updateCourse(@RequestBody @Valid Course c) {
		cs.updateCourse(c);
	}
	
	

}
