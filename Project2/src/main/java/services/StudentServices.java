package services;

import java.util.List;

import dao.StudentDaoImpl;
import model.Student;

public class StudentServices 
{
	StudentDaoImpl sd;
	
	public int addStudent(Student s)
	{
		sd = new StudentDaoImpl();
		return sd.insertStudent(s);
	}
	public List<Student> getAllStudents()
	{
		sd = new StudentDaoImpl();
		return sd.selectAllStudent();
	}
	public Student getStudentById(int id)
	{
		sd = new StudentDaoImpl();
		return sd.selectStudentById(id);
	}
	public void updateStudent(Student change)
	{
		sd = new StudentDaoImpl();
	    sd.updateStudent(change);
	}
	public void deleteStudentById(int id)
	{
		sd = new StudentDaoImpl();
		sd.deleteStudentById(id);
	}
}
