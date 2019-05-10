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

import model.Administrator;

@Transactional
@EnableTransactionManagement
@Repository
public class AdministratorRepository {

	@Autowired
	SessionFactory sf;
	
	public List<Administrator> getAllAdministrators(){
		List<Administrator> admins = new ArrayList<>();
		Session s = sf.getCurrentSession();
		Criteria cr = s.createCriteria(Administrator.class);
		admins = cr.list();
		return admins;
	}
	
	public Administrator getAdministratorById(int id) {
		Session s = sf.getCurrentSession();
		Administrator admin = (Administrator) s.get(Administrator.class, id);
		return admin;
	}
	
	public void insertAdministrator(Administrator a) {
		Session s = sf.getCurrentSession();
		s.persist(a);
	}
	public void updateAdministrator(Administrator a) {
		Session s = sf.getCurrentSession();
		s.save(a);
	}
	
	public void deleteAdministratorById(int id) {
		Session s = sf.getCurrentSession();
		s.delete(s.get(Administrator.class, id));
	}
}
