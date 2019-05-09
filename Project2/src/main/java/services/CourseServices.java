package services;

import java.util.List;

import com.google.api.services.calendar.model.Event;

import dao.CourseDaoImpl;
import factory.EventFactory;
import model.Course;

public class CourseServices 
{
	CourseDaoImpl cd;
	
	public int addCourse(Course c)
	{
		// using an eventFactory, we can create events in the calendar from courses or
		// meetings with the same method
		// call because the method is overloaded to handle meetings and courses
		Event event = EventFactory.getEvent(c);
		System.out.printf("Event created: %s\n", event.getHtmlLink());
		//
		cd = new CourseDaoImpl();
		return cd.insertCourse(c);
	}
	public List<Course> getAllCourses()
	{
		cd = new CourseDaoImpl();
		return cd.selectAllCourse();
	}
	public Course getCourseById(int id)
	{
		cd = new CourseDaoImpl();
		return cd.selectCourseById(id);
	}
	public void updateCourse(Course change)
	{
		cd = new CourseDaoImpl();
	    cd.updateCourse(change);
	}
	public void deleteCourseById(int id)
	{
		cd = new CourseDaoImpl();
		cd.deleteCourseById(id);
	}
}
