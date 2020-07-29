package ems.member.assembler;

import ems.member.dao.StudentDAO;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

public class StudentAssembler {
	
	//초기화
	private StudentDAO studentDAO;
	private StudentAllSelectService allSelectService;
	private StudentDeleteService deleteService;
	private StudentModifyService modifyService;
	private StudentRegisterService registerService;
	private StudentSelectService selectService;
	
	//생성자 - studentDAO를 주입, java프로그래밍에서의 의존 주입
	public StudentAssembler() {
		
		studentDAO = new StudentDAO();
		allSelectService = new StudentAllSelectService(studentDAO);
		deleteService = new StudentDeleteService(studentDAO);
		modifyService = new StudentModifyService(studentDAO);
		registerService = new StudentRegisterService(studentDAO);
		selectService = new StudentSelectService(studentDAO);
		
	}
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public StudentAllSelectService getAllSelectService() {
		return allSelectService;
	}

	public void setAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}

	public StudentDeleteService getDeleteService() {
		return deleteService;
	}

	public void setDeleteService(StudentDeleteService deleteService) {
		this.deleteService = deleteService;
	}

	public StudentModifyService getModifyService() {
		return modifyService;
	}

	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}

	public StudentRegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(StudentRegisterService registerService) {
		this.registerService = registerService;
	}

	public StudentSelectService getSelectService() {
		return selectService;
	}

	public void setSelectService(StudentSelectService selectService) {
		this.selectService = selectService;
	}
	

}
