package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDAO;

public class StudentSelectService {

	private StudentDAO studentDAO;
	
	public StudentSelectService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student select(String sNum) {
		if(verify(sNum)) {
			return studentDAO.select(sNum);
		} else {
			System.out.println("Student information is not available.");
		}
		
		return null;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student != null ? true : false;
	}
	
}
