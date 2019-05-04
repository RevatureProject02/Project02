package Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Student;
import util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int insertStudent(Student s)
	{
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer)session.save(s);
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
	public List<Student> selectAllStudent()
	{
		Session session = HibernateUtil.getSession();
		List<Student> students = null;
		try
		{
			students = session.createQuery("FROM Student").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return students;
	}

	@Override
	public Student selectStudentById(int id)
	{
		Session session = HibernateUtil.getSession();
		Student s = null;
		try
		{
			s = (Student) session.get(Student.class, id);
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return s;
	}

	@Override
	public void updateStudent(Student change) 
	{
		Session session = HibernateUtil.getSession();
		Student s = null;
		try
		{
			session.beginTransaction();
			s = (Student) session.get(Student.class, change.getId());
			s.setName(change.getName());
			s.setAge(change.getAge());
			s.setUsername(change.getUsername());
			s.setPassword(change.getPassword());
			s.setEmail(change.getEmail());
			s.setCourses(change.getCourses());
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
	public void deleteStudentById(int id) {
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Student.class, id));
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
