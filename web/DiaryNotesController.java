package com.g3.spc.web;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.g3.spc.entities.DiaryNotes;
import com.g3.spc.entities.Subject;
import com.g3.spc.service.IDiaryNotesService;
import com.g3.spc.service.ISubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Validated
@RestController
@RequestMapping("/api")
@Api(value = "School Parent communication App")
public class DiaryNotesController {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(DiaryNotesController.class);
	
	@Autowired
	IDiaryNotesService diarynotes;

	public DiaryNotesController() {
		log.info("Inside Diary Notes Rest Controller Constructor");
		System.out.println("------>> Diary notes rest controller");
	}
	
	@ApiOperation(value = "DiaryNotes post mapping" , response = DiaryNotes.class)
	@PostMapping("/DiaryNotes")
	public DiaryNotes insertDiaryNotes(@RequestBody  @Valid DiaryNotes dn){
		log.info("Inside insert DiaryNotes");
		diarynotes.addDiaryNotes(dn);
		return dn;
	}
	
	@ApiOperation(value = "DiaryNotes get mapping to fetch all the notes" , response = List.class)
	@GetMapping("/DiaryNotes")
	public List<DiaryNotes> getAllDiaryNotes(){
		log.info("Inside Get all DiaryNotes");
		return diarynotes.retrieveAllDiaryNotes();
	}
	
	@ApiOperation(value = "DiaryNotes get mapping to delete the notes" , response = DiaryNotes.class)
	@GetMapping("/DiaryNotes/Delete")
	public DiaryNotes deleteDiaryNotes(@RequestBody DiaryNotes dn){
		log.info("Inside delete DiaryNotes");
		return diarynotes.deleteDiaryNotes(dn);
	}
	
	@ApiOperation(value = "DiaryNotes get mapping to fetch notes by subject" , response = DiaryNotes.class)
	@GetMapping("/DiaryNotes/{subject}")
	public List<DiaryNotes> getAllDiaryNotes(@PathVariable String subject){
		log.info("Inside get all DiaryNotes by subject");
		return  diarynotes.retrieveAllDiaryNotes(subject);
	}
	
	
	@ApiOperation(value = "DiaryNotes put mapping to update notes" , response = DiaryNotes.class)
	@PutMapping("/DiaryNotes")
	public DiaryNotes doUpdate(@RequestBody DiaryNotes dn) {
		log.info("Inside update DiaryNotes");
		return diarynotes.updateDiaryNotes(dn);
	}
	

}
