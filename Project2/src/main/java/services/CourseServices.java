package services;

import java.util.List;

import dao.CourseDaoImpl;
import model.Course;

public class CourseServices 
{
	CourseDaoImpl cd;
	
	public int addCourse(Course c)
	{
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
