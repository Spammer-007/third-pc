package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.GenericDao;
import com.lti.dao.StudentDao;
import com.lti.entity.StudentRegistration;

@Service
public class StudentService {

	@Autowired
	private GenericDao genericDao;
	
	@Autowired
	private StudentDao studentDao;
	
	
	public void addStudent(StudentRegistration st){
		genericDao.upsert(st);
		
	}

	public boolean checkLogin(int studentId, String studentPassword) {
		
			int result=studentDao.readLogin(studentId, studentPassword);
		
		if(result==1){
			return true;
		}
		else 
			return false;
	}
	
	@SuppressWarnings("unchecked")
	public List fetchByStudentId(int studentId){
			List list=genericDao.fetchByStudentId(studentId);
			return list;
	   	 }

}
