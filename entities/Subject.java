package com.g3.spc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class Subject {
	
	@Id
	@ApiModelProperty(name = "SubjectID",value="Holds the subject id",required = true)
    @NotNull(message = "Subject id cannot be null or blank")
	private int subjectId;
	
	@ApiModelProperty(name = "SubjectTitle",value="Holds the subject title",required = true)
    @NotEmpty(message = "Subject title cannot be null or blank")
	private String title;
	
	
	
	public Subject() {
		super();
	}

	public Subject(int subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", title=" + title + "]";
	}
	
}