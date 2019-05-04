package Dao;

import java.util.List;

import model.Student;

public interface StudentDao 
{
	public int insertStudent(Student s);
	public List<Student> selectAllStudent();
	public Student selectStudentById(int id);
	public void updateStudent(Student change);
	public void deleteStudentById(int id);
}
