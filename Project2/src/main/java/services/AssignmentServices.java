package services;

import java.util.List;

import org.junit.experimental.theories.internal.Assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Assignment;
import model.Course;
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
	public List<Assignment> getAssignmentsOfCourse(Course c)
	{
		return c.getAssignments();
	}
	
}
