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

import model.Assignment;
import services.AssignmentServices;

@Controller
@CrossOrigin
@RequestMapping("Assignments")
public class AssignmentController 
{
	@Autowired
	AssignmentServices as;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
		public ResponseEntity<List<Assignment>> getAllAssignments()
		{
			return new ResponseEntity<List<Assignment>>(as.getAllAssignments(),HttpStatus.OK);
		}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Assignment> getAssignmentById(@PathVariable int id)
	{
		return new ResponseEntity<Assignment>(as.getAssignmentById(id),HttpStatus.OK);
	}
	//Delete a user
		@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
		public void deleteAssignmentById(@PathVariable int id)
		{
			as.deleteAssignmentById(id);
		}
		//Insert
		@RequestMapping(value = "/add",method = RequestMethod.GET)
		@ResponseBody
		public void addAssignment(@RequestBody Assignment a)
		{
			as.addAssignment(a);
		}
		//update
		@RequestMapping(value = "/update", method = RequestMethod.GET)
		@ResponseBody
		public void updateAssignment(@RequestBody Assignment a)
		{
			as.updateAssignment(a);
		}
		
}
