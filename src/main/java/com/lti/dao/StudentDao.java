package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.StudentRegistration;;

@Component
public class StudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public int readLogin(int studentId, String studentPassword){
		//System.out.println("Here");
		String query = "Select s from StudentRegistration as s where s.studentId=:studentId and s.studentPassword=:password";
		TypedQuery<StudentRegistration> q1 = entityManager.createQuery(query, StudentRegistration.class);
		q1.setParameter("studentId", studentId);
		q1.setParameter("password", studentPassword);
		List<StudentRegistration> lists = q1.getResultList();
		
		return lists.size();
		
}
}
