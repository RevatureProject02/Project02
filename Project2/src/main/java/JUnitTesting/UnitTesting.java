package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Administrator;
import model.Professor;
import model.Student;
import services.AdministratorServices;
import services.ProfessorServices;
import services.StudentServices;

class UnitTesting {

	//This will test repositories > and services
	@BeforeEach
	void BeginTestCycle()
	{
		System.out.println();
		System.out.println("Test Start");
		System.out.println();
	}
	
	@AfterEach
	void EndTestCycle()
	{
		System.out.println();
		System.out.println("Test end");
		System.out.println();
	}
	
	@Test
	void test() 
	{
		StudentServices ss = new StudentServices();
		ss.addStudent(new Student(0,"billy",23,"billbur","17381","k@gmail.com"));
		assertEquals("billy",ss.getStudentById(0).getName());
	}
	
	@Test
	void test2()
	{
		ProfessorServices ps = new ProfessorServices();
		ps.insertProfessor(new Professor(0,"james",22,"Junjin","jkdia;","ksk@gmail.com",2));
		assertEquals("james",ps.getProfessorById(0).getName());
	}
	
	@Test
	void test3()
	{
		AdministratorServices as = new AdministratorServices();
		as.addAdministrator(new Administrator(0,"cameron",30,"Hunan","Jagdeep","JHC@gmail.com"));
        assertEquals("cameron",as.getAdministratorById(0).getName());	
	}

}
