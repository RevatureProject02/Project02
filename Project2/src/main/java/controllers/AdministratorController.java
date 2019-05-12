package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Administrator;
import services.AdministratorServices;

@Controller
@RequestMapping("/administrator")
@CrossOrigin
public class AdministratorController
{

	@Autowired
	AdministratorServices as;
	

	
	 @GetMapping("/all")
	 @ResponseBody		
	public List<Administrator> getAllAdministrators(){
		 return as.getAllAdministrators();
	 }
	
		
}
