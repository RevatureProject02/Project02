package dao;

import java.util.List;

import model.Administrator;

public interface AdministratorDao 
{
	public int insertAdministrator(Administrator a);
	public List<Administrator> selectAllAdministrator();
	public Administrator selectAdministratorById(int id);
	public void updateAdministrator(Administrator change);
	public void deleteAdministratorById(int id);
}
