package com.g3.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g3.spc.entities.DiaryNotes;
import com.g3.spc.entities.Subject;

public interface IDiaryNotesRepository extends JpaRepository<DiaryNotes, Integer>{
//	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes);
//	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes);
//	public DiaryNotes deleteDiaryNotes(DiaryNotes diaryNotes);
//	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate date);
//	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject);
	
	
}
