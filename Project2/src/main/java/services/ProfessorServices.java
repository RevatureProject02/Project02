package services;

import java.util.List;

import dao.ProfessorDaoImpl;
import model.Professor;
import repositories.ProfessorRepository;

public class ProfessorServices 
{
	ProfessorRepository pr;
	
	public int insertProfessor(Professor p)
	{
		return pr.insertProfessor(p);
	}
	public List<Professor> getAllProfessors()
	{
		return pr.selectAllProfessors();
	}
	public Professor getProfessorById(int id)
	{
		return pr.selectProfessorById(id);
	}
	public void updateProfessor(Professor change)
	{
		pr.updateProfessor(change);
	}
	public void deleteProfessorById(int id)
	{
		pr.deleteProfessorById(id);
	}
}
