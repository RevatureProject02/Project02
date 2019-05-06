package Services;

import java.util.List;

import Dao.AdministratorDaoImpl;
import model.Administrator;

public class AdministratorServices 
{
	AdministratorDaoImpl add;
	
	public int addAdministrator(Administrator a)
	{
		add = new AdministratorDaoImpl();
		return add.insertAdministrator(a);
	}
	public List<Administrator> getAllAdministrators()
	{
		add = new AdministratorDaoImpl();
		return add.selectAllAdministrator();
	}
	public Administrator getAdministratorById(int id)
	{
		add = new AdministratorDaoImpl();
		return add.selectAdministratorById(id);
	}
	public void updateAdministrator(Administrator change)
	{
		add = new AdministratorDaoImpl();
	    add.updateAdministrator(change);
	}
	public void deleteAdministratorById(int id)
	{
		add = new AdministratorDaoImpl();
		add.deleteAdministratorById(id);
	}
}
