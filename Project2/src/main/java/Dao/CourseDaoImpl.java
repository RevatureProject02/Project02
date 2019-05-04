package Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Course;
import util.HibernateUtil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public int insertCourse(Course c) {
		
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer)session.save(c);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		return id;
	}

	@Override
	public List<Course> selectAllCourse() {
		Session session = HibernateUtil.getSession();
		List<Course> courses = null;
		try
		{
			courses = session.createQuery("FROM Course").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return courses;
	}

	@Override
	public Course selectCourseById(int id)
	{
		Session session = HibernateUtil.getSession();
		Course c = null;
		try
		{
			c = (Course) session.get(Course.class, id);
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return c;
	}

	@Override
	public void updateCourse(Course change) {
		Session session = HibernateUtil.getSession();
		Course c = null;
		try
		{
			session.beginTransaction();
			c = (Course) session.get(Course.class, change.getId());
			c.setName(change.getName());
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		
	}

	@Override
	public void deleteCourseById(int id) 
	{
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Course.class, id));
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		
	}

}
