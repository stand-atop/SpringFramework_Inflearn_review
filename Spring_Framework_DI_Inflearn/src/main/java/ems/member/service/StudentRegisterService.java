package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDAO;

public class StudentRegisterService {

	private StudentDAO studentDAO;
	
	public StudentRegisterService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	//학생 등록
	public void register(Student student) {
		
		String sNum = student.getsNum();
		
		if(verify(student.getsNum())) {
			studentDAO.insert(student);
		} else {
			System.out.print("The student has already registered");
		}
		
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student == null ? true : false;
	}
	
}
