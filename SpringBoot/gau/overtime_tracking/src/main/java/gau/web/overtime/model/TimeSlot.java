package gau.web.overtime.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TimeSlot {

	@GeneratedValue
	@Id
	private long id;
	
	private Date startTime;
	private Date endTime;
	private Type type;

	public TimeSlot() {
	}
	
	public TimeSlot(Date startTime, Date endTime, Type type) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.type = type;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
