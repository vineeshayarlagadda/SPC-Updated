package com.g3.spc.web;


import java.util.List;
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

import com.g3.spc.entities.Attendance;
import com.g3.spc.service.IAttendanceService;

import io.swagger.annotations.Api;

@Validated
@RestController
@RequestMapping("/api")
@Api(value = "School Parent communication App")
public class AttendanceRestController {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(AttendanceRestController.class);
	
	@Autowired
	private IAttendanceService attendance;
	
	public AttendanceRestController() {
		log.info("Inside Attendance Rest Controller Constructor");
		System.out.println("------>> Attendance Rest Controller Constructor");
	}
	
	@PostMapping("/attendance")
	public Attendance insertAttendance(@RequestBody Attendance a) {
		log.info("Inside insert attendance");
		attendance.addAttendance(a);
		return a;
	}
	
	@PutMapping("/attendance/update")
	public Attendance updateAttendance(@RequestBody Attendance a)
	{
		log.info("Inside update attendance");
		return attendance.updateAttendance(a);
	}
	
	@GetMapping("/attendance/{month}")
	public List<Attendance> getAllAttendance(@PathVariable int month){
		log.info("Inside get attendance by month");
		return attendance.listAttendanceByMonth(month);
	}
}
