package Dao;

import java.util.List;

import model.Professor;

public interface ProfessorDao 
{
	public int insertProfessor(Professor p);
	public List<Professor> selectAllProfessor();
	public Professor selectProfessorById(int id);
	public void updateProfessor(Professor change);
	public void deleteProfessorById(int id);
	
}
