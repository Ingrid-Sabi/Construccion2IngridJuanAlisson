package app.domain.model;

import java.sql.Date;

public class ClinicalRecord {
	private long id;
	private Date date;
	private User doctors;
	private String motive;
	private String symptoms;
	private String Diagnosis;
	private String recordNumber;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getDoctors() {
		return doctors;
	}
	public void setDoctors(User doctors) {
		this.doctors = doctors;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return Diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}
	public String getRecordNumber() {
		return recordNumber;
	}
	public void setRecordNumber(String recordNumber) {
		this.recordNumber = recordNumber;
	}
	
	
	
	

	
	
	
	

}
