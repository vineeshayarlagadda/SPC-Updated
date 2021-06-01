package com.g3.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g3.spc.entities.ClassId;
import com.g3.spc.entities.Parent;
import com.g3.spc.entities.Student;

public interface IParentRepository extends JpaRepository<Parent,Integer>{
//	public Parent addParent(Parent parent);
//	public Parent updateParent(Parent parent);
//	public List<Parent> retrieveParentListByClass(ClassId classId);
//	public Parent retrieveParentByStudent(Student student);
//	public Parent retrieveParentById(int id);
	
}
