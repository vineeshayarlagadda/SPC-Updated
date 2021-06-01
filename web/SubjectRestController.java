package com.g3.spc.web;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g3.spc.entities.Subject;
import com.g3.spc.service.ISubjectService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(value = "School Parent communication App")
public class SubjectRestController {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(SubjectRestController.class);
	
	@Autowired
	private ISubjectService subject;
	
	
	public SubjectRestController() {
		log.info("Inside Subject Rest Controller Constructor");
		System.out.println("------>> Subject Rest Controller Constructor");
	}
	
	@PostMapping("/subjects")
	public Subject insertSubject(@RequestBody @Valid Subject s) {
		log.info("Inside insert subject");
		subject.addSubject(s);
		return s;
	}
		
	@GetMapping("/subjects")
	public List<Subject> showAllSubjects(){
		log.info("Inside get all subjects");
		return subject.retrieveAllSubjects();
	}
	
	@PostMapping("/subjects/{id}")
	public String deleteSubject(@PathVariable int id) {
		log.info("Inside delete subject by id");
		return subject.deleteSubject(id);
	}

}
