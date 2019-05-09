package services;

import java.util.List;

import dao.AdvisorDaoImpl;
import model.Advisor;

public class AdvisorServices 
{
	AdvisorDaoImpl ad;
	
	public int addAdvisor(Advisor a)
	{
		ad = new AdvisorDaoImpl();
		return ad.insertAdvisor(a);
	}
	public List<Advisor> getAllAdvisors()
	{
		ad = new AdvisorDaoImpl();
		return ad.selectAllAdvisor();
	}
	public Advisor getAdvisorById(int id)
	{
		ad = new AdvisorDaoImpl();
		return ad.selectAdvisorById(id);
	}
	public void updateAdvisor(Advisor change)
	{
		ad = new AdvisorDaoImpl();
	    ad.updateAdvisor(change);
	}
	public void deleteAdvisorById(int id)
	{
		ad = new AdvisorDaoImpl();
		ad.deleteAdvisorById(id);
	}
}
