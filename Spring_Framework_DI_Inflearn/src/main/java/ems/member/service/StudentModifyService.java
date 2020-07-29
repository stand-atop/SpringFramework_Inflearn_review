package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDAO;

public class StudentModifyService {

	private StudentDAO studentDAO;
	
	public StudentModifyService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void modify(Student student) {
		if(verify(student.getsNum())) {
			studentDAO.update(student);
		} else {
			System.out.println("Student information is not available.");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student != null ? true : false;
	}
	
}
