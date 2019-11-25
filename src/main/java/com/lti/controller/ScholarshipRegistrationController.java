package com.lti.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.ScholarshipBasic;

import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentMarks12;
import com.lti.entity.DocumentsUpload;
import com.lti.entity.StudentRegistration;
import com.lti.entity.AcademicDetails;
import com.lti.service.ScholarshipService;
import com.lti.service.StateService;
import com.lti.service.StudentService;

@Controller
@SessionAttributes("student")
public class ScholarshipRegistrationController {
	
	@Autowired
	private ScholarshipService ScholarshipService;

	 private int i = 0;
	    
	/*
	 * @RequestMapping("/BasicDetails") public ModelAndView BasicDetails() { return
	 * new ModelAndView("ScholarshipBasic", new HashMap<>()); }
	 * 
	 */
	 
		/*@RequestMapping("/ScholarshipBasic")
	    public ModelAndView StudDetailsForm(@RequestAttribute(studentId), ModelMap Model) {
	        return new ModelAndView("Scholarship_basic", new HashMap<>());
  
		}*/
		
		@RequestMapping("/ScholarshipBasic")
	    public ModelAndView StudDetailsForm(ModelMap model) {
			//Map<String,Object>map=new HashMap<>();
		
			return new ModelAndView("Scholarship_basic",model);
	        //return new ModelAndView("Scholarship_basic", new HashMap<>());
  
		}
		
	 @RequestMapping(path = "ScholarshipBasic.nsp", method = RequestMethod.POST)
		public String addAcademic(ScholarshipBasic studBasic, ModelMap model)
		{
		/*
		 * StudentRegistration s=(StudentRegistration) model.get("student");
		 * studBasic.setStudentRegistration(s);
		 */
			        
			ScholarshipService.addScholarshipBasic(studBasic);
			return "AcademicDetails";
		}
	 
		
		@RequestMapping(path = "AcademicDetails.nsp", method = RequestMethod.POST)
		public String addAcademic(AcademicDetails AcademicDetails, ModelMap model)
		{
			StudentRegistration s=(StudentRegistration) model.get("student");
			AcademicDetails.setStudentRegistration(s);
			        
			ScholarshipService.addAcademic(AcademicDetails);
			return "StudentMarks_10";
		}
		
		@RequestMapping(path = "StudentMarks10.nsp", method = RequestMethod.POST)
		public String addStudentMarks10(StudentMarks10 StudentMarks10, ModelMap model)
		{   
			StudentRegistration s=(StudentRegistration) model.get("student");
			StudentMarks10.setStudentRegistration(s);
			ScholarshipService.addMarks10(StudentMarks10);
			return "StudentMarks_12";
		}
		
		@RequestMapping(path = "StudentMarks12.nsp", method = RequestMethod.POST)
		public String addStudentMarks12(StudentMarks12 StudentMarks12, ModelMap model)
		{   
			StudentRegistration s=(StudentRegistration) model.get("student");
			StudentMarks12.setStudentRegistration(s);
			ScholarshipService.addMarks12(StudentMarks12);
			return "DocumentsUpload";
		}
		
		@RequestMapping(path = "DocumentsUpload.nsp", method = RequestMethod.POST)
		public String addDoc(DocumentsUpload DocumentsUpload, ModelMap model)
		{        
			StudentRegistration s=(StudentRegistration) model.get("student");
			DocumentsUpload.setStudentRegistration(s);
			ScholarshipService.addDocuments(DocumentsUpload);
			return "StudentDashboard"; // It should go to Apply for schemes page. for now it is Home
		}
	    
//	    @RequestMapping("/Details10")
//	    public ModelAndView Details10() {
//	        return new ModelAndView("StudentsMarks_10", new HashMap<>());  
//		}
//		
//	    @RequestMapping("/Details12")
//	    public ModelAndView Details12() {
//	        return new ModelAndView("StudentsMarks_12", new HashMap<>());  
//		}
//	    
//	    @RequestMapping("/AcademicDetails")
//	    public ModelAndView AcademicDetails() {
//	        return new ModelAndView("AcademicDetails", new HashMap<>());  
//		}
//	    
//	    @RequestMapping("/DocumentsUpload")
//	    public ModelAndView DocumentsUpload() {
//	        return new ModelAndView("DocumentsUpload", new HashMap<>());
//		}
	}


