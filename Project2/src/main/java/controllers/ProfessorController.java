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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Meeting;
import model.Professor;
import services.ProfessorServices;

@Controller
@RequestMapping("professor")
@CrossOrigin(origins= "*", allowedHeaders = "*", value = "*")

public class ProfessorController 
{

	@Autowired
	ProfessorServices ps;

	
	@GetMapping(value="/all")
	public ResponseEntity<List<Professor>> getAllProfessors(){
		return new ResponseEntity<>(ps.getAllProfessors(), HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}")
	public Professor getProfessorById(int id) {
		return ps.getProfessorById(id);
	}
	
	@PostMapping(value="/add")
	@ResponseBody
	public void insertProfessor(@RequestBody Professor p) {
		ps.insertProfessor(p);
	}
	
	@PutMapping(value="/update")
	public void updateProfessor(@RequestBody Professor p) {
		ps.updateProfessor(p);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteProfessorById(@PathVariable int id) {
		ps.deleteProfessorById(id);
	}
}
