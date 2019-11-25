package com.lti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.service.StateService;

@Controller
public class AdminController {
	 private int i = 0;
	    
	    @RequestMapping("/")
	    public ModelAndView index() {
	       return new ModelAndView("index",new HashMap<>());
	    }
	    
	    @RequestMapping("#")
	    public ModelAndView hellopage() {
	       return new ModelAndView("index",new HashMap<>());
	    }
	    
	    @RequestMapping("/StateLogin")
	    public ModelAndView StateDetailsForm() {
	        return new ModelAndView("StateLogin", new HashMap<>());
  
		}
		
		@Autowired
		private StateService stateService;
	    @RequestMapping("/StateLogin.nsp")
        //return new ModelAndView("StateLogin", new HashMap<>());
		public ModelAndView StateLogin(@RequestParam("AdminId") String AdminId, @RequestParam("Password") String Password ){
			boolean i=stateService.checkLogin(AdminId, Password);
			Map<String,Object>map=new HashMap<>();
			if(i) {
				map.put("Id",AdminId);
			}
			ModelAndView mv=new ModelAndView("confirmpage",map);
			ModelAndView mv2=new ModelAndView("#");

			if(i){
				
				System.out.println(" STATE Login Success");
				return mv;
			}
			else{
				System.out.println("STATE Login Failed");
				return mv2;

			}
		}
	    
	    @RequestMapping("/Ministry")
	    public ModelAndView Ministry() {
	       return new ModelAndView("new_views/Ministry",new HashMap<>());
	    }
	    
	    @RequestMapping("/StateNodalOfficer")
	    public ModelAndView StateNodalOfficer() {
	       return new ModelAndView("new_views/StateNodalOfficer",new HashMap<>());
	    }
	       
	}


