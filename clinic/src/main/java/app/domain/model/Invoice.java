package app.domain.model;

import java.sql.Date;

public class Invoice {
	private long id;
	private Patient patientName;
	private User doctors;
	private String companyName;
    private int policyNumber;
	private int validity;
    private Date date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Patient getPatientName() {
		return patientName;
	}
	public void setPatientName(Patient patientName) {
		this.patientName = patientName;
	}
	public User getDoctors() {
		return doctors;
	}
	public void setDoctors(User doctors) {
		this.doctors = doctors;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public int getPolicyValidityDays() {
		return policyValidityDays;
	}
	public void setPolicyValidityDays(int policyValidityDays) {
		this.policyValidityDays = policyValidityDays;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
    
	
    
    
    

	

	
	

}
