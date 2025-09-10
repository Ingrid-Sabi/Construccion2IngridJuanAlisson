package app.domain.services;

import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;
import app.domain.ports.ClinicalRecordPort;

public class CreateClinicalRecord {
	
	private UserPort userPort;
	private PatientPort patientPort;
	private ClinicalRecordPort clinicalRecordPort;
	
	public void create(ClinicalRecord clinicalRecord) throws Exception {
		
		
		if (clinicalRecord == null) {
			throw new Exception("La historia clínica no puede ser nula");
		}
		
		
		if (clinicalRecord.getRecordNumber() == null || clinicalRecord.getRecordNumber().isEmpty()) {
			throw new Exception("La historia clínica debe tener un número válido");
		}
		
		
		if (clinicalRecordPort.findByRecordNumber(clinicalRecord.getRecordNumber()) != null) {
			throw new Exception("Ya existe una historia clínica registrada con ese número");
		}
		
		
		if (clinicalRecord.getPatientDocument() == null || ((User) clinicalRecord.getPatientDocument()).isEmpty()) {
			throw new Exception("La historia clínica debe tener un documento de paciente");
		}
		
		Patient patient = patientPort.findByDocument(clinicalRecord.getPatientDocument());
		if (patient == null) {
			throw new Exception("La historia clínica debe estar asociada a un paciente válido");
		}
		
		
		if (clinicalRecord.getDoctors() == null || clinicalRecord.getDoctors().isEmpty()) {
			throw new Exception("La historia clínica debe especificar el documento del doctor");
		}
		
		User doctor = userPort.findByDocument(clinicalRecord.getDoctors());
		if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)) {
			throw new Exception("La historia clínica se debe registrar por un doctor válido");
		}
		
		
		if (clinicalRecord.getDate() == null) {
			throw new Exception("La historia clínica debe tener una fecha");
		}
		
		
		if (clinicalRecord.getDescription() == null || ((User) clinicalRecord.getDescription()).isEmpty()) {
			throw new Exception("La historia clínica debe contener una descripción");
		}
		
		
		clinicalRecordPort.save(clinicalRecord);
	}
}