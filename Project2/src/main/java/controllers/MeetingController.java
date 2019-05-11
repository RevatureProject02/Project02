package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
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

import model.Meeting;
import services.MeetingServices;

@Controller
@RequestMapping("/meeting")
@CrossOrigin
public class MeetingController 
{

	@Autowired
	MeetingServices ms;

	@GetMapping(value = "/all")
	public ResponseEntity<List<Meeting>> getAllMeetings() {
		return new ResponseEntity<>(ms.getAllMeetings(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Meeting> getMeetingById(@PathVariable int id) {
		return new ResponseEntity<Meeting>(ms.getMeetingById(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/add")
	@ResponseBody
	public void insertMeeting(@RequestBody Meeting m) {
			ms.insertMeeting(m);
	}
	
	@PutMapping("/update")
	public void updateMeeting(@RequestBody Meeting m) {
		ms.updateMeeting(m);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMeetingById(@PathVariable int id) {
		ms.deleteMeetingById(id);
	}
}
