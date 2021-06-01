package com.g3.spc.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parent {
	@Id
	private int parentId;
	
//	@OneToOne(cascade = CascadeType.ALL)                           
//	@JoinColumn(name = "Student_ID",referencedColumnName = "studentId")
//	private Student student;
	
	public Parent() {
		super();
	}
	
	private String mobileNumber;
	private String emailId;
	public Parent(int parentId, String mobileNumber, String emailId) {
		super();
		this.parentId = parentId;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + parentId;
//		result = prime * result + ((student == null) ? 0 : student.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (parentId != other.parentId)
			return false;
//		if (student == null) {
//			if (other.student != null)
//				return false;
//		} else if (!student.equals(other.student))
//			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Parent [parentId=" + parentId  + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + "]";
	}
	
	
	
	
	
}
