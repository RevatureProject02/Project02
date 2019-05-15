package repositories;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import model.Professor;

@Transactional
@EnableTransactionManagement
@Repository
public class ProfessorRepository {

	@Autowired
	SessionFactory sf;
	
	
	public int insertProfessor(Professor p) 
	{
		Session s = sf.getCurrentSession();
		return (int)s.save(p);
	}

	
	public List<Professor> selectAllProfessors() {
		
		Session s = sf.getCurrentSession();
		List<Professor> professors = new ArrayList<Professor>();
		Criteria cr = s.createCriteria(Professor.class);
		professors = cr.list();
		return professors;
	}

	
	public Professor selectProfessorById(int id) {
		Session s = sf.getCurrentSession();
		return (Professor) s.get(Professor.class, id);
	}

	
	public void updateProfessor(Professor change) 
	{
		Session s = sf.getCurrentSession();
		s.update(change);
		
	}

	
	public void deleteProfessorById(int id) {
		Session s = sf.getCurrentSession();
		s.delete(s.get(Professor.class, id));
	}



}
