package com.g3.spc.service;

import java.util.List;

import com.g3.spc.entities.ClassId;
import com.g3.spc.entities.Parent;
import com.g3.spc.entities.Student;

public interface IParentService {
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> retrieveParentListByClass(ClassId classId);
	public Parent retrieveParentByStudent(Student student);
	public Parent retrieveParentById(int id);
	
}
