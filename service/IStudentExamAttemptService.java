package com.g3.spc.service;

import java.util.List;

import com.g3.spc.entities.Student;
import com.g3.spc.entities.StudentExamAttempt;

public interface IStudentExamAttemptService {
	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt attempt);
	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt attempt);
	public StudentExamAttempt deleteStudentExamAttempt(StudentExamAttempt attempt);
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(Student student);
	public StudentExamAttempt retrieveStudentExamAttemptById(int id);
	
	
}
