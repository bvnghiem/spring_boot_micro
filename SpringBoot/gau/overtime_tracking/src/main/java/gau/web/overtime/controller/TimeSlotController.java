package gau.web.overtime.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gau.web.overtime.model.TimeSlot;
import gau.web.overtime.service.TimeSlotService;

@RestController
@RequestMapping("/time/")
public class TimeSlotController {

	@Autowired
	private TimeSlotService timeSlotService;
	
	@GetMapping("/slots")
	public List<TimeSlot> getAllTimeSlots() {
		return timeSlotService.getAllTimeSlots();
	}
	
	@PostMapping("/slots")
	public void createTimeSlot(@Validated @RequestBody TimeSlot timeSlot) {
		timeSlotService.createTimeSlot(timeSlot);
	}
}
