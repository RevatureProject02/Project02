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

import model.Assignment;

@Transactional
@Repository
@EnableTransactionManagement
public class AssignmentRepository 
{
	@Autowired
	SessionFactory sf;
	
	public List<Assignment> getAssignments()
	{
		List<Assignment> assignments = new ArrayList<Assignment>();
		Session s = sf.getCurrentSession();
		Criteria cr = s.createCriteria(Assignment.class);
		assignments=cr.list();
		return assignments;
	}
	
	public Assignment getById(int id)
	{
		Session s  = sf.getCurrentSession();
		return (Assignment)s.get(Assignment.class,id);
	}
	
	public void persistAssignment(Assignment a)
	{
		Session s = sf.getCurrentSession();
		s.save(a);
	}
	
	public void deleteAssignmentById(int id)
	{
		Session s = sf.getCurrentSession();
		s.delete(s.get(Assignment.class, id));
	}
	
	public void updateAssignment(Assignment a)
	{
		Session s = sf.getCurrentSession();
		s.save(a);
	}
}
