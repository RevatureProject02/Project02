package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventDateTime;

import calenderapi.CalendarQuickstart;
import model.Advisor;
import model.Course;
import model.Meeting;
import model.Professor;
import services.ProfessorServices;

public class EventFactory {

	public static Event getEvent(Meeting m) 
	{
		try {
	//authorize api client service
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Calendar service = new Calendar.Builder(HTTP_TRANSPORT, JacksonFactory.getDefaultInstance(), CalendarQuickstart.getCredentials(HTTP_TRANSPORT))
                .setApplicationName(CalendarQuickstart.APPLICATION_NAME)
                .build();
    //
//        List<Professor> listOfProfessors = m.getProfessors();
//        List<Advisor> listOfAdvisors = m.getAdvisors();
//
//        if(m.getLocation().equals("Professor's Office")) {
//        	m.setLocation("Room " + listOfProfessors.get(0).getOffice());
//        }
//        if(m.getLocation().equals("Advisor's Office")) {
//        	m.setLocation("Advisory Office");
//        }
    //creating the event object and 
        Event event = new Event()
        	    .setSummary(m.getSummary())
        	    .setLocation(m.getLocation())
        	    .setDescription("You might have a meeting.");

        
        //this block is for setting the start time of the meeting
        	DateTime startDateTime = new DateTime(m.getMyDate() + m.getTime() + "-04:00");//might have to fiddle with the -4:00 to get it to be the right EST time
        	EventDateTime start = new EventDateTime()
        	    .setDateTime(startDateTime)
        	    .setTimeZone("UTC");
        	event.setStart(start);
        //


        	//2019-05-04T14:00:00-04:00
        //using UTC, and a -4:00, we get the EST time translated from UTC.. 15:00:00-4:00 = 3pm somehow
        	DateTime endDateTime = new DateTime(m.getMyDate() + m.getTime() + "-04:30");//might be -3:30, its one of these
        	EventDateTime end = new EventDateTime()
        	    .setDateTime(endDateTime)
        	    .setTimeZone("UTC");
        	event.setEnd(end);
        //in the above block, i've specified the length of any meeting being created to be 30 minutes..
        	
        
        //this block specifies who else should have their calendar affected by the meeting event.
        //this block uses loops to set the list of attendees based off of lists to be filled up when a 
        //meeting is instantiated on the java side.
        //im not sure if this will work right, probably will be revisited
        	
//        	int i=0;
////        	if(m.getAdvisors()!=null) {
//        			for(Advisor advisor : m.getAdvisors()) {
//        				EventAttendee attendee = new EventAttendee();
//        				attendee.setEmail(advisor.getEmail());
//    	    attendees[i] = attendee;
//    	    i++;
//        			//}
//        	}
////        	if(m.getProfessors()!=null) {
//        			for(Professor professor : m.getProfessors()) {
//        				EventAttendee attendee = new EventAttendee();
//        				attendee.setEmail(professor.getEmail());
//    	    attendees[i] = attendee;
//    	    i++;
        			//}
        	//}
        	
        	EventAttendee attendee = new EventAttendee();
        	attendee.setEmail("professororadvisor@gmail.com");
        	EventAttendee[] attendees = new EventAttendee[] {attendee};
        	
        	
        	event.setAttendees(Arrays.asList(attendees));
        //
            //calendarId is referring to a gmail to post to.. primary means the logged-in and authenticated gmail user
        	String calendarId = "primary";//primary could be set to our session variable once login is made
        								  //i think we will use caching to store the logged-in user
        	event = service.events().insert(calendarId, event).execute();
        //
        	return event;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	public static Event getEvent(Course c){
		try {
	//authorize api client service
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Calendar service = new Calendar.Builder(HTTP_TRANSPORT, JacksonFactory.getDefaultInstance(), CalendarQuickstart.getCredentials(HTTP_TRANSPORT))
                .setApplicationName(CalendarQuickstart.APPLICATION_NAME)
                .build();
    //
        
    //creating the event object and 
        Event event = new Event()
        	    .setSummary(c.getName())
        	    .setLocation(c.getLocation())
        	    .setDescription("Course creation!");

        	
        //this block is for setting the start time of the meeting
        	DateTime startDateTime = new DateTime(c.getTime().toString()+ "-04:00");//might have to fiddle with the -4:00 to get it to be the right EST time
        	EventDateTime start = new EventDateTime()
        	    .setDateTime(startDateTime)
        	    .setTimeZone("UTC");
        	event.setStart(start);
        //

        	//2019-05-04T14:00:00-04:00
        //using UTC, and a -4:00, we get the EST time translated from UTC.. 15:00:00-4:00 = 3pm somehow
        	DateTime endDateTime = new DateTime(c.getTime().toString()+ "-05:00");//might be -3:00, its one of these
        	EventDateTime end = new EventDateTime()
        	    .setDateTime(endDateTime)
        	    .setTimeZone("UTC");
        	event.setEnd(end);
        //in the above block, i've specified the length of any course being created to be 60 minutes..
        	
        
        //this block specifies who else should have their calendar affected by the course event.
        //this block uses loops to set the list of attendees based off of lists to be filled up when a 
        //meeting is instantiated on the java side.
        //im not sure if this will work right, probably will be revisited
//        	EventAttendee attendee = new EventAttendee();
//        	attendee.setEmail("kyle.biesecker@gmail.com");
//        	EventAttendee[] attendees = new EventAttendee[] {attendee};
//        	event.setAttendees(Arrays.asList(attendees));
        //
        	

        	
System.out.println(c.getDays());

//below is code that can make a meeting recurring or set reminders via gmail for the meeting
        	//need to set the byday to be dependent on a dropdown box that fits the api's format..
        	//MO, TU, WE, TH, FR.. any days can be used, just put them in the right order..
        	//values of our dropdown box should be "MO, WE, FR", "TU, TH", "MO, WE", "FR".. these would be good starters
        	String[] recurrence = new String[] {"RRULE:FREQ=WEEKLY;UNTIL=20190801T170000Z;BYDAY=" + c.getDays()};
        	event.setRecurrence(Arrays.asList(recurrence));
        
            //calendarId is referring to a gmail to post to.. primary means the logged-in and authenticated gmail user
        	String calendarId = "professororadvisor@gmail.com";//primary could be set to our session variable once login is made
        								  //i think we will use caching to store the logged-in user
        	event = service.events().insert(calendarId, event).execute();
        	System.out.printf("Event created: %s\n", event.getHtmlLink());
        //
		return event;

	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		
	}
}
