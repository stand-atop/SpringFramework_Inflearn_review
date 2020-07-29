package ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ems.member.Student;


//DAO = DB와 통신함
public class StudentDAO {

	//DB를 연결하지 않았기 때문에 Map을 이용해 데이터를 쌓음
	private Map<String, Student> studentDB = new HashMap<String, Student>();
	
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}
	
	public Map<String, Student> getStudentDB(){
		return studentDB;
	}
	
	
}
