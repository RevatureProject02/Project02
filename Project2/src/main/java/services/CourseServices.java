package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Course;
import repositories.CourseRepository;

@Service
public class CourseServices 
{
	
	@Autowired
	CourseRepository cr;
	//Get All courses
	public List<Course> getAllCourses()
	{
		return cr.getCourses();
	}
	//Get single course
	public Course getCourseById(int id)
	{
		return cr.getById(id);
	}
	//Save
	public void addCourse(Course c)
	{
		cr.persistCourse(c);
	}
	//Delete
	public void deleteCourseById(int id)
	{
		cr.deleteCourseById(id);
	}
	//Update
	public void updateCourse(Course c)
	{
		cr.updateCourse(c);
	}
	
}
