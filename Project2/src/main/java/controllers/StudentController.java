package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
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
	

}
