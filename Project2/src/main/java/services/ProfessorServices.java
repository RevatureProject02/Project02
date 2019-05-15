package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Professor;
import repositories.ProfessorRepository;

@Service
public class ProfessorServices 
{
	@Autowired
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