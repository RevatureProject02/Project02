package dao;

import java.util.List;

import model.Advisor;

public interface AdvisorDao 
{
	public int insertAdvisor(Advisor a);
	public List<Advisor> selectAllAdvisor();
	public Advisor selectAdvisorById(int id);
	public void updateAdvisor(Advisor change);
	public void deleteAdvisorById(int id);
}
