package repositories;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import model.Student;

@Transactional
@Repository
@EnableTransactionManagement
public class StudentRepository 
{
	@Autowired
	SessionFactory sf;
	//Get All Students
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		Session s = sf.getCurrentSession();
		Criteria cr = s.createCriteria(Student.class);
		students=cr.list();
		return students;
	}
	//Get single Student
	public Student getById(int id)
	{
		Session s = sf.getCurrentSession();
		return (Student) s.get(Student.class, id);
	}
	//Saving
	public void persistStudent(Student student)
	{
		Session s = sf.getCurrentSession();
		s.persist(student);
	}
	//Deleting
	public int deleteStudentById(int id)
	{
		Session s = sf.getCurrentSession();
		s.delete(s.get(Student.class, id));
		return id;
	}
	//Update Student
	public void updateStudent(Student student)
	{
		Session s = sf.getCurrentSession();
		s.save(student);
	}
}
