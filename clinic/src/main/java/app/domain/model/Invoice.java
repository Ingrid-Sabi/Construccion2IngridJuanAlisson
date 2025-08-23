package app.domain.model;

public class Invoice {
	private long id;
	private patient patient;
	private User doctors;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public patient getPatient() {
		return patient;
	}
	public void setPatient(patient patient) {
		this.patient = patient;
	}
	public User getDoctors() {
		return doctors;
	}
	public void setDoctors(User doctors) {
		this.doctors = doctors;
	}
	
	
	/*falta nombre poliza
	 * # poliza
	 * dias vigencia
	 * fecha final poliza
	 */
	
	

}
