package com.g3.spc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.spc.entities.ClassId;
import com.g3.spc.entities.Parent;
import com.g3.spc.entities.Student;
import com.g3.spc.repository.IParentRepository;


@Service
public class IParentServiceImpl implements IParentService{
	
	@Autowired
	private IParentRepository parentRepo;

	@Override
	@Transactional
	public Parent addParent(Parent parent) {
		parentRepo.save(parent);
		return parent;
	}

	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parent> retrieveParentListByClass(ClassId classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent retrieveParentByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent retrieveParentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
