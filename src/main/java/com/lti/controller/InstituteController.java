package com.lti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.InstituteRegistration;
import com.lti.service.InstituteService;

@Controller
public class InstituteController {
	

	@Autowired
	private InstituteService instService;
	
	@RequestMapping(path="/Scholarship/instRegister.nsp")
	public ModelAndView addinst(@ModelAttribute("regnow") InstituteRegistration institute ){
		System.out.println("adag");
		instService.addInstitute(institute);
		Map<String,Object>map=new HashMap<>();
		map.put("Id",institute.getInstituteCode());
		ModelAndView mv=new ModelAndView("confirmpage",map);
		return mv;

	}
	
	
	@RequestMapping("/InstRegister")
    public ModelAndView InstDetailsForm() {
        return new ModelAndView("instituteRegister", new HashMap<>());

	}
	
	@RequestMapping("/InstituteLogin")
    public ModelAndView instituteLogin() {
        return new ModelAndView("InstituteLogin", new HashMap<>());

	}
	
	@RequestMapping(path="/InstituteLogin.nsp")
	public ModelAndView instituteLogin(@RequestParam("instituteCode") String instituteCode, @RequestParam("password") String password ){
		boolean i=instService.checkLogin(Integer.parseInt(instituteCode), password);
		Map<String,Object>map=new HashMap<>();
		if(i) {
			map.put("Id",instituteCode);
		}
		ModelAndView mv=new ModelAndView("confirmpage",map);
		ModelAndView mv2=new ModelAndView("#");

		if(i){
			
			System.out.println(" Institute Login Success");
			return mv;
		}
		else{
			System.out.println("Institute Login Failed");
			return mv2;

		}
	}
}
