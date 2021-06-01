package com.g3.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g3.spc.entities.Attendance;
import com.g3.spc.entities.Student;

public interface IAttendanceRepository extends JpaRepository<Attendance, Integer>{
//	public Attendance addAttendance(Attendance attendance);
//	public Attendance updateAttendance(Attendance attendance);
//	public List<Attendance> listAttendanceByMonth(LocalDate month);
//	public List<Attendance> listAttendanceByStudent(Student student);
	
	
}
