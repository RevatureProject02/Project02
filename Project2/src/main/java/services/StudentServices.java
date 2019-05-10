package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Student;
import repositories.StudentRepository;
@Service
public class StudentServices 
{
	@Autowired
	StudentRepository sr;
	
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		return sr.getStudents();
	}
	
}
