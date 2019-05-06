package Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Administrator;
import util.HibernateUtil;

public class AdministratorDaoImpl implements AdministratorDao {

	
	public int insertAdministrator(Administrator a)
	{
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer)session.save(a);
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

	
	public List<Administrator> selectAllAdministrator() 
	{
		Session session = HibernateUtil.getSession();
		List<Administrator> Administrators = null;
		try
		{
			Administrators = session.createQuery("FROM Administrator").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return Administrators;
	}

	@Override
	public Administrator selectAdministratorById(int id) 
	{
		Session session = HibernateUtil.getSession();
		Administrator a = null;
		try
		{
			a = (Administrator)session.get(Administrator.class, id);
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
	public void updateAdministrator(Administrator change) 
	{
		Session session = HibernateUtil.getSession();
		Administrator a = null;
		try
		{
			session.beginTransaction();
			a = (Administrator) session.get(Administrator.class, change.getId());
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
	public void deleteAdministratorById(int id) 
	{
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Administrator.class, id));
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
