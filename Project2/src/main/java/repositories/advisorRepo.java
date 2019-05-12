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

import model.Advisor;

@Transactional
@EnableTransactionManagement
@Repository
public class advisorRepo {
	
	@Autowired
	SessionFactory sf;
	
	public String insertAdvisor(Advisor a) {
		Session s= sf.getCurrentSession();
		s.persist(a);
		return "added";
	}
	
	public List<Advisor> selectAllAdvisors(){
		List<Advisor> advisors = new ArrayList<Advisor>();
		Session s = sf.getCurrentSession();
		Criteria cr = s.createCriteria(Advisor.class);
		advisors = cr.list();
		return advisors;
	}
	
	
	

}
