package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Assignment;
import repositories.AssignmentRepository;

@Service
public class AssignmentServices 
{
	
	@Autowired
	AssignmentRepository ar;
	
	public List<Assignment> getAllAssignments()
	{
		return ar.getAssignments();
	}
	
	public Assignment getAssignmentById(int id)
	{
		return ar.getById(id);
	}
	
	public void addAssignment(Assignment a)
	{
		ar.persistAssignment(a);
	}
	
	public void deleteAssignmentById(int id)
	{
		ar.deleteAssignmentById(id);
	}
	
	public void updateAssignment(Assignment a)
	{
		ar.updateAssignment(a);
	}
}
