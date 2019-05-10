package dao;

import java.util.List;

import model.Course;

public interface CourseDao 
{
	public int insertCourse(Course c);
	public List<Course> selectAllCourse();
	public Course selectCourseById(int id);
	public void updateCourse(Course change);
	public void deleteCourseById(int id);
}
