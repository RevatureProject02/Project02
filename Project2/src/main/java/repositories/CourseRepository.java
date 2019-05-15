package repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import model.Course;

@Transactional
@Repository
@EnableTransactionManagement
public class CourseRepository 
{
	@Autowired
	SessionFactory sf;
	//Get All courses
	public List<Course> getCourses()
	{
		List<Course> courses = new ArrayList<Course>();
		Session s = sf.getCurrentSession();
		Criteria cr = s.createCriteria(Course.class);
		courses=cr.list();
		return courses;
		
	}
	//Get Single course
	public Course getById(int id)
	{
		Session s = sf.getCurrentSession();
		return (Course)s.get(Course.class, id);
	}
	//Saving
	public void persistCourse(Course c)
	{
		Session s = sf.getCurrentSession();
		s.save(c);
	}
	//Deleting
	public String deleteCourseById(int id)
	{
		Session s = sf.getCurrentSession();
		
		Course c = (Course)s.get(Course.class,id);
		s.delete(s.get(Course.class, id));
		return c.getName();
	}
	//Update Course
	public void updateCourse(Course c)
	{
		Session s = sf.getCurrentSession();
		s.save(c);
	}
	
}
