package com.g3.spc.service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g3.spc.entities.DiaryNotes;
import com.g3.spc.entities.Subject;
import com.g3.spc.repository.IDiaryNotesRepository;

@Service
public class IDiaryNotesServiceImpl implements IDiaryNotesService{
	
	@Autowired
	IDiaryNotesRepository diarynotesrepo;
	
	

	public IDiaryNotesServiceImpl() {
		super();
	}

	public IDiaryNotesServiceImpl(IDiaryNotesRepository diarynotesrepo) {
		super();
		this.diarynotesrepo = diarynotesrepo;
	}

	@Override
	@Transactional
	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes) {
		diarynotesrepo.save(diaryNotes);
		return diaryNotes;
	}

	@Override
	@Transactional
	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes) {
		
		Optional<DiaryNotes> searchDiarynotes = diarynotesrepo.findById(diaryNotes.getDiaryNotesId());
		DiaryNotes dn = null;
		if(searchDiarynotes.isPresent()) {
			dn = searchDiarynotes.get();
		    dn.setNotes(diaryNotes.getNotes());
		    diarynotesrepo.save(dn);
		}
		return dn;
	}

	@Override
	public DiaryNotes deleteDiaryNotes(DiaryNotes diaryNotes) {
		diarynotesrepo.delete(diaryNotes);
		return diaryNotes;
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes() {
		return diarynotesrepo.findAll();
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(String subject) {
		List<DiaryNotes> AllDiaryNotes = diarynotesrepo.findAll();
		//Below code need to be changed to stream APi
		List<DiaryNotes> tempDiaryNotes = AllDiaryNotes.stream().filter((x)->(x.getNotes().containsKey(subject))).collect(Collectors.toList());
		
		return tempDiaryNotes;
	}
	

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate date) {
		return null;
	}


	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject) {
		return null;
	}

	

}