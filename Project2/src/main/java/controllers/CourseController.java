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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Course;
import services.CourseServices;

@Controller
@CrossOrigin
@RequestMapping("course")
public class CourseController {

	@Autowired
	CourseServices cs;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Course>> getAllCourses() {
		return new ResponseEntity<List<Course>>(cs.getAllCourses(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Course> getCourseById(@PathVariable int id) {
		return new ResponseEntity<Course>(cs.getCourseById(id), HttpStatus.OK);
	}

	// Delete a user
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public void deleteCourseById(@PathVariable int id) {
		cs.deleteCourseById(id);
	}

	// Insert
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public void addCourse(@RequestBody Course c) {
		cs.addCourse(c);
	}

	// update
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	public void updateCourse(@RequestBody @Valid Course c) {
		cs.updateCourse(c);
	}
	
	

}
