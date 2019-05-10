package Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Administrator;
import repositories.AdministratorRepository;

@Service
public class AdministratorServices 
{
	@Autowired
	AdministratorRepository ar;
	
	public void addAdministrator(Administrator a)
	{
		ar.insertAdministrator(a);
	}
	public List<Administrator> getAllAdministrators()
	{
		List<Administrator> admins = new ArrayList<>();
		return ar.getAllAdministrators();
		
	}
	public Administrator getAdministratorById(int id)
	{
		return ar.getAdministratorById(id);
	}
	public void updateAdministrator(Administrator a)
	{
	    ar.updateAdministrator(a);
	}
	public void deleteAdministratorById(int id)
	{
		ar.deleteAdministratorById(id);
	}
}
