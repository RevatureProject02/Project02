package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Administrator;
import services.AdministratorServices;

@RestController
@RequestMapping("/administrator")
@CrossOrigin
public class AdministratorController {

	@Autowired
	AdministratorServices as;

	@GetMapping("/all")
	public List<Administrator> getAllAdministrators() {
		return as.getAllAdministrators();
	}

	@GetMapping("/{id}")
	public Administrator getById(@PathVariable int id) {
		return as.getAdministratorById(id);
	}

	@GetMapping("/add")
	public void insertAdministrator(@RequestBody @Valid Administrator a) {
		as.addAdministrator(a);
	}

	@PutMapping("/update")
	public void updateAdministrator(@RequestBody Administrator a) {
		as.updateAdministrator(a);
	}

	// probably not needed, but here in just in case
	@DeleteMapping("/delete/{id}")
	public void deleteAdministratorById(@PathVariable int id) {
		as.deleteAdministratorById(id);
	}

	@CrossOrigin
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public boolean validateAdministrator(@RequestBody MultiValueMap<String, String> fromParams) {
		String username = fromParams.getFirst("username");
		String password = fromParams.getFirst("password");
		boolean isValid = false;
		
		System.out.println("username: "+username + " password " + password);
		for (Administrator a : as.getAllAdministrators()) {
			if (a.getUsername().equals(username)) {
				// Define the Session as an administrator, hold onto the administrator
				Administrator sessionAdministrator = a;
				if (a.getPassword().equals(password)) {
					// Allow login
					isValid = true;
//					return isValid;
				} else {
					// Tell the user that they entered incorrect information
					isValid = false;
//					return isValid;
				}
			}
		}return isValid;

	}
}
