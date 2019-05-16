package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Course;
import model.Student;
import repositories.StudentRepository;
@Service
public class StudentServices 
{
	@Autowired
	StudentRepository sr;
	
	//Get All
	public List<Student> getAllStudents()
	{
		List<Student> students = new ArrayList<Student>();
		return sr.getStudents();
	}
	//Get one
	public Student getStudentById(int id)
	{
		return sr.getById(id);
	}
	
	//saving
	public void addStudent(Student s)
	{
		sr.persistStudent(s);
	}
	//Delete
	public void deleteStudentById(int id)
	{
		sr.deleteStudentById(id);
	}
	//Update
	public void updateStudent(Student s)
	{
		sr.updateStudent(s);
	}
	
	public void addCourse(Course course, Student student) {
		sr.addCourse(course, student);
	}
}
