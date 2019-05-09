package services;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.EventReminder;
import com.google.api.services.calendar.model.Events;

import calenderapi.CalendarQuickstart;
import dao.MeetingDao;
import dao.MeetingDaoImpl;
import factory.EventFactory;
import model.Advisor;
import model.Meeting;
import model.Professor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingServices {
	CalendarQuickstart cq = new CalendarQuickstart();

	// in this service, i will create a calendar event if the meeting is inserted
	// into our db.. might want to do it
	// the other way around, where the meeting is only inserted into our db if the
	// calendar event is added to calendar
	// this method returns 0 if unsuccessful
	public int insertMeeting(Meeting m) {
		try {
			// using an eventFactory, we can create events in the calendar from courses or
			// meetings with the same method
			// call because the method is overloaded to handle meetings and courses
			Event event = EventFactory.getEvent(m);
			System.out.printf("Event created: %s\n", event.getHtmlLink());
			//

			MeetingDao md = new MeetingDaoImpl();
			return md.insertMeeting(m);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}