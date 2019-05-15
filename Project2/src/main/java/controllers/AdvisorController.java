package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Advisor;
import services.AdvisorServices;
import services.Encryptor;

@Controller
@RequestMapping("advisor")
@CrossOrigin
public class AdvisorController{
	
	@Autowired
	AdvisorServices as;
	
	@GetMapping(value="/allAdvisors")
	public ResponseEntity<List<Advisor>> allAdvisors(){
		return new ResponseEntity<>(as.selectAllAdvisors(), HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}")
	public Advisor selectAdvisorById(@PathVariable int id) {
		return as.selectAdvisorById(id);
	}
	
	@PostMapping(value="/addAdvisor")
	@ResponseBody
	public void insertAdvisor(@RequestBody Advisor a)
	{
		a.setPassword(new Encryptor().Encrypt(a.getPassword()));
		as.insertAdvisor(a);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteAdvisorById(@PathVariable int id) {
		as.deleteAdvisorById(id);
	}
	 
	
	
	 
	
	
	
	
	
	
}