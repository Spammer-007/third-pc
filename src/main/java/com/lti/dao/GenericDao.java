package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentRegistration;


@Repository
	public class GenericDao {
		
		@PersistenceContext
		protected EntityManager entityManager;
		
		@Transactional
		public void upsert(Object obj){
			entityManager.merge(obj);
		}
		
		@SuppressWarnings("unchecked")
		public Object fetchById(Class clazz,Object pk){

		   	      Object o=entityManager.find(clazz,pk);  
		   		   return o;
		   	 }
		@Transactional
		public void update(Object obj) {
			entityManager.merge(obj);
		}

		public List fetchByStudentId(int studentId) {
			String query = "Select s from StudentRegistration as s where s.studentId=:studentId";
			TypedQuery<StudentRegistration> q1 = entityManager.createQuery(query, StudentRegistration.class);
			q1.setParameter("studentId", studentId);
			List<StudentRegistration> lists = q1.getResultList();
			return lists;
		}
}
		   	
		
		
