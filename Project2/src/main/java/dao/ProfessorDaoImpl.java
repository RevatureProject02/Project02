package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Professor;
import util.HibernateUtil;

public class ProfessorDaoImpl implements ProfessorDao {

	@Override
	public int insertProfessor(Professor p) 
	{
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer)session.save(p);
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
	public List<Professor> selectAllProfessor() {
		
		Session session = HibernateUtil.getSession();
		List<Professor> professors = null;
		try
		{
			professors = session.createQuery("FROM Professor").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return professors;
	}

	@Override
	public Professor selectProfessorById(int id) {
		Session session = HibernateUtil.getSession();
		Professor p = null;
		try
		{
			p = (Professor) session.get(Professor.class,id);
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return p;
	}

	@Override
	public void updateProfessor(Professor change) 
	{
		Session session = HibernateUtil.getSession();
		Professor p = null;
		try
		{
			session.beginTransaction();
			p = (Professor) session.get(Professor.class, change.getId());
			p.setName(change.getName());
			p.setAge(change.getAge());
			p.setUsername(change.getUsername());
			p.setPassword(change.getPassword());
			p.setEmail(change.getEmail());
			p.setCourses(change.getCourses());
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
	public void deleteProfessorById(int id) {
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Professor.class, id));
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
