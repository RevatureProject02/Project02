package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.Meeting;
import util.HibernateUtil;

public class MeetingDaoImpl implements MeetingDao {
	
	//remember to make sure that google stores the same meeting id as us 
	//by sending the id over in the events.Insert()
	@Override
	public int insertMeeting(Meeting m) {
		
		Session session = HibernateUtil.getSession();
		int id = 0;
		try
		{
			session.beginTransaction();
			id = (Integer)session.save(m);
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
	public List<Meeting> selectAllMeetings() {
		Session session = HibernateUtil.getSession();
		List<Meeting> meetings = null;
		try
		{
			meetings = session.createQuery("FROM Meeting").list();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return meetings;
	}

	@Override
	public Meeting selectMeetingById(int id)
	{
		Session session = HibernateUtil.getSession();
		Meeting m = null;
		try
		{
			m = (Meeting) session.get(Meeting.class, id);
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return m;
	}

	//think i need to check for nulls in Meeting m here.. could go without if we do validation that doesnt allow
	//any meetings to be inserted with null fields
	@Override
	public void updateMeeting(Meeting change) {
		Session session = HibernateUtil.getSession();
		Meeting m = null;
		try
		{
			session.beginTransaction();
			m = (Meeting) session.get(Meeting.class, change.getId());
			m.setSummary(change.getSummary());
			m.setLocation(change.getLocation());
			m.setTime(change.getTime());
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
	public void deleteMeetingById(int id) 
	{
		Session session = HibernateUtil.getSession();
		try
		{
			session.beginTransaction();
			session.delete(session.get(Meeting.class, id));
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

