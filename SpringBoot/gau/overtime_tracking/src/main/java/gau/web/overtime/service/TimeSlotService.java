package gau.web.overtime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gau.web.overtime.model.TimeSlot;

@Component
public class TimeSlotService {

	@Autowired
	private TimeSlotRepository timeSlotRepo;
	
	public List<TimeSlot> getAllTimeSlots() {
		return timeSlotRepo.findAll();
	}

	public TimeSlot createTimeSlot(TimeSlot timeSlot) {
		return timeSlotRepo.saveAndFlush(timeSlot);
	}
}
