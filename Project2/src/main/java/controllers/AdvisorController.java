package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Advisor;
import services.AdvisorServices;

@Controller
@RequestMapping("MEI/Advisor")
@CrossOrigin
public class AdvisorController{
	
	@Autowired
	AdvisorServices as;
	
	@GetMapping(value="/allAdvisors")
	public ResponseEntity<List<Advisor>> allAdvisors(){
		return new ResponseEntity<>(as.selectAllAdvisors(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/advisorById")
	public Advisor selectAdvisorById(@PathVariable int id) {
		return as.selectAdvisorById(id);
	}
	
	@PostMapping(value="/add")
	public void insertAdvisor(@RequestBody Advisor a) {
		as.insertAdvisor(a);
	}
	
	
	
	
	
	
}