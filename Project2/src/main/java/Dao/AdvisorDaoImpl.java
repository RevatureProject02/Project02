package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Advisor;
import util.HibernateUtil;

public class AdvisorDaoImpl implements AdvisorDao {

	@Override
	public int insertAdvisor(Advisor a)
	{
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer) session.save(a);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			session.getTransaction().commit();
		}
		finally
		{
			session.close();
		}
		return id;
	}

	@Override
	public List<Advisor> selectAllAdvisor() {
		Session session = HibernateUtil.getSession();
		List<Advisor> advisors = null;
		try
		{
			advisors = session.createQuery("FROM Advisor").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return advisors;
	}
	
	@Override
	public Advisor selectAdvisorById(int id) {
		Session session = HibernateUtil.getSession();
		Advisor a = null;
		try
		{
			a = (Advisor)session.get(Advisor.class, id);
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return a;
	}

	@Override
	public void updateAdvisor(Advisor change) 
	{
		Session session = HibernateUtil.getSession();
		Advisor a = null;
		try
		{
			session.beginTransaction();
			a = (Advisor) session.get(Advisor.class,change.getId());
			a.setName(change.getName());
			a.setAge(change.getAge());
			a.setUsername(change.getUsername());
			a.setPassword(change.getPassword());
			a.setEmail(change.getEmail());
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
	public void deleteAdvisorById(int id) 
	{
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Advisor.class, id));
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
