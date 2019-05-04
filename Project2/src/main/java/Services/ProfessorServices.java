package Services;

import java.util.List;

import Dao.ProfessorDaoImpl;
import model.Professor;

public class ProfessorServices 
{
	ProfessorDaoImpl pd;
	
	public int addProfessor(Professor p)
	{
		pd = new ProfessorDaoImpl();
		return pd.insertProfessor(p);
	}
	public List<Professor> getAllProfessors()
	{
		pd = new ProfessorDaoImpl();
		return pd.selectAllProfessor();
	}
	public Professor getProfessorById(int id)
	{
		pd = new ProfessorDaoImpl();
		return pd.selectProfessorById(id);
	}
	public void updateProfessor(Professor change)
	{
		pd = new ProfessorDaoImpl();
	    pd.updateProfessor(change);
	}
	public void deleteProfessorById(int id)
	{
		pd = new ProfessorDaoImpl();
		pd.deleteProfessorById(id);
	}
}
