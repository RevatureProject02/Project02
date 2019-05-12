package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Advisor;
import repositories.advisorRepo;

@Service
public class AdvisorServices 
{
		
	@Autowired
	advisorRepo adrepo;
	
	public Advisor selectAdvisorById(int id) {
		List<Advisor> advisors = adrepo.selectAllAdvisors();
		for(Advisor a: advisors) {
			if(id ==a.getId()) {
				return a;
			}
		}
		return null;
	}
	
	public void insertAdvisor(Advisor a) {
		adrepo.insertAdvisor(a);
	}
	
	public List<Advisor> selectAllAdvisors(){
//		List<Advisor> advisors = new ArrayList<Advisor>();
		return adrepo.selectAllAdvisors();
	}
	
	
	
	
	
	
}
