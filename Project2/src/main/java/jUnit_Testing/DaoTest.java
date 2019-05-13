//package jUnit_Testing;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import model.Administrator;
//import model.Advisor;
//import model.Course;
//import model.Professor;
//import model.Student;
//import services.AdministratorServices;
//import services.AdvisorServices;
//import services.CourseServices;
//import services.ProfessorServices;
//import services.StudentServices;
//
//class DaoTest  {
//	AdministratorServices ads = new AdministratorServices();
//	AdvisorServices as = new AdvisorServices();
//	ProfessorServices ps = new ProfessorServices();
//	StudentServices ss = new StudentServices();
//	CourseServices cs = new CourseServices();
//	
//	@BeforeEach
//	void spaceCheck()
//	{	
//		System.out.println("\n====Beginning new test====\n");
//	}
//	@AfterEach
//	void LastCheck()
//	{
//		System.out.println("\n====Ending Test====\n");
//	}
//	
//	@Test
//	void InsertAndSelectAdministrator() 
//	{	
//		 ads.addAdministrator(new Administrator());
//		assertNotNull(ads.getAllAdministrators().get(0));
//	}
//	
//	@Test
//	void InsertAndSelectAdvisor()
//	{
//		as.addAdvisor(new Advisor());
//		assertNotNull(as.getAllAdvisors().get(0));
//	}
//	
//	@Test
//	void InsertAndSelectProfessor()
//	{
//		ps.insertProfessor(new Professor());
//		assertNotNull(ps.getAllProfessors().get(0));
//	}
//	
//	@Test
//	void InsertAndSelectStudent()
//	{
//		 ss.addStudent(new Student());
//		assertNotNull(ss.getAllStudents().get(0));
//	}
//	
//	@Test
//	void InsertAndSelectCourse()
//	{
//		cs.addCourse(new Course());
//		assertNotNull(cs.getAllCourses().get(0));
//	}
//	
//	@Test
//	void UpdateAdministratorTest()
//	{
//		int x = ads.addAdministrator(new Administrator());
//		Administrator change = new Administrator();
//		change.setAge(18);
//		change.setName("Gerald");
//		change.setId(x);
//		change.setEmail("James@Gmail.com");
//		change.setUsername("HenryType");
//		change.setPassword("Quak");
//		ads.updateAdministrator(change);
//		assertEquals(change.getUsername(),ads.getAdministratorById(x).getUsername());
//	}
//	
//	@Test
//	void UpdateAdvisorTest()
//	{
//		int x = as.addAdvisor(new Advisor());
//		Advisor change = new Advisor();
//		change.setAge(18);
//		change.setName("Gerald");
//		change.setId(x);
//		change.setEmail("James@Gmail.com");
//		change.setUsername("HenryType");
//		change.setPassword("Quak");
//		as.updateAdvisor(change);
//		assertEquals(change.getUsername(),as.getAdvisorById(x).getUsername());
//	}
//	
//	@Test
//	void UpdateProfessorTest()
//	{
//		int x = ps.insertProfessor(new Professor());
//		Professor change = new Professor();
//		change.setAge(18);
//		change.setName("Gerald");
//		change.setId(x);
//		change.setEmail("James@Gmail.com");
//		change.setUsername("HenryType");
//		change.setPassword("Quak");
//		ps.updateProfessor(change);
//		assertEquals(change.getUsername(),ps.getProfessorById(x).getUsername());
//	}
//	
//	
//	@Test
//	void UpdateStudentTest()
//	{
//		int x = ss.addStudent(new Student());
//		Student change = new Student();
//		change.setAge(18);
//		change.setName("Gerald");
//		change.setId(x);
//		change.setEmail("James@Gmail.com");
//		change.setUsername("HenryType");
//		change.setPassword("Quak");
//		ss.updateStudent(change);
//		assertEquals(change.getUsername(),ss.getStudentById(x).getUsername());
//	}
//	
//	@Test
//	void UpdateCourseTest()
//	{
//		int x = cs.addCourse(new Course());
//		Course change = new Course();
//		change.setName("English");
//		change.setId(x);
//		cs.updateCourse(change);
//		assertEquals(change.getName(),cs.getCourseById(x).getName());
//	}
//	@Test
//	void DeletionTestAdministrator()
//	{
//		int x = ads.addAdministrator(new Administrator());
//		ads.deleteAdministratorById(x);
//		assertNull(ads.getAdministratorById(x));
//	}
//	
//	@Test
//	void DeletionTestAdvisor()
//	{
//		int x = as.addAdvisor(new Advisor());
//		as.deleteAdvisorById(x);
//		assertNull(as.getAdvisorById(x));
//	}
//	
//	@Test
//	void DeletionTestProfessor()
//	{
//		int x = ps.insertProfessor(new Professor());
//		ps.deleteProfessorById(x);
//		assertNull(ps.getProfessorById(x));
//	}
//	
//	@Test
//	void DeletionTestStudent()
//	{
//		int x = ss.addStudent(new Student());
//		ss.deleteStudentById(x);
//		assertNull(ss.getStudentById(x));
//	}
//	
//	@Test
//	void DeletionTestCourse()
//	{
//		int x = cs.addCourse(new Course());
//		cs.deleteCourseById(x);
//		assertNull(cs.getCourseById(x));
//	}
//
//}
