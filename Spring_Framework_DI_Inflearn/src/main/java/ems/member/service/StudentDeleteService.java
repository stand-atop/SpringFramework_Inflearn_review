package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDAO;

public class StudentDeleteService {

	private StudentDAO studentDAO;
	
	public StudentDeleteService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void delete(Student student) {
		if(verify(student.getsNum())) {
			studentDAO.delete(student.getsNum());
		} else {
			System.out.println("Student information is not available");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student != null ? true : false;
	}
	
}
