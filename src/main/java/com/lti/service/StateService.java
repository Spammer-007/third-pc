package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.StateDao;

@Service
public class StateService {
	
	
	@Autowired
	private StateDao statedao;
	
	
	public boolean checkLogin(String AdminId, String Password) {
		int result=statedao.readLogin(AdminId, Password);
	
	if(result==1){
		
		return true;
	}
	else 
		return false;
}

}
