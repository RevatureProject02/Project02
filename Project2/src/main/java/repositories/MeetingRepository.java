//package repositories;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.hibernate.Criteria;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import model.Meeting;
//import util.HibernateUtil;
//
//@Transactional
//@EnableTransactionManagement
//@Repository
//public class MeetingRepository {
//
//	@Autowired
//	SessionFactory sf;
//	
//	//remember to make sure that google stores the same meeting id as us 
//	//by sending the id over in the events.Insert()
//
//	public int insertMeeting(Meeting m) {
//		Session s = sf.getCurrentSession();
//		return (int) s.save(m);
//	}
//
//	
//	public List<Meeting> selectAllMeetings() {
//		
//		List<Meeting> meetings = new ArrayList<Meeting>();
//		Session s = sf.getCurrentSession();
//		Criteria cr = s.createCriteria(Meeting.class);
//		meetings = cr.list();
//		return meetings;
//	}
//
//	
//	public Meeting selectMeetingById(int id)
//	{
//		Session s = sf.getCurrentSession();
//		return (Meeting) s.get(Meeting.class, id);
//	}
//
//	//think i need to check for nulls in Meeting m here.. could go without if we do validation that doesnt allow
//	//any meetings to be inserted with null fields
//	
//	public void updateMeeting(Meeting change) {
//		//not sure if this works
//		Session s = sf.getCurrentSession();
//		s.update(change);
//	}
//
//	
//	public void deleteMeetingById(int id) 
//	{
//		Session s = sf.getCurrentSession();
//		s.delete(s.get(Meeting.class, id));
//		
//	}
//
//}
