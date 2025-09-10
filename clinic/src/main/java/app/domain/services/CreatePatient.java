package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreatePatient {
	
	private PatientPort patientPort;
	private UserPort userPort;
	
	public void create(Patient patient) throws Exception {
		
		
		if (patient == null) {
			throw new Exception("El paciente no puede ser nulo");
		}
		
		if (patientPort.findByDocument(patient) != null) {
			throw new Exception("Ya existe una persona registrada con esa cédula");
		}
		
		
		if (patient.getUserName() == null || ((Patient) patient.getUserName()).isEmpty()) {
			throw new Exception("El nombre de usuario es obligatorio");
		}
		
		if (patientPort.findByUserName(patient) != null) {
			throw new Exception("Ya existe una persona registrada con ese nombre de usuario");
		}
		
		
		if (patient.getDateBirth() <= 0) {
			throw new Exception("La edad del paciente debe ser mayor a 0");
		}
		
		if (patient.getMail() == null || ((Patient) patient.getMail()).isEmpty()) {
		    throw new Exception("El correo electrónico es obligatorio");
		}
		if (!((String) patient.getMail()).contains("@")) {
		    throw new Exception("El correo electrónico no es válido");
		}

		if (patient.getPhone() == null || patient.getPhone().isEmpty()) {
		    throw new Exception("El número de teléfono es obligatorio");
		}
		if (patient.getPhone().length() < 10) {
		    throw new Exception("El número de teléfono debe tener al menos 10 dígitos");
		}

		
		
		patientPort.save(patient);
	}

	public UserPort getUserPort() {
		return userPort;
	}

	public void setUserPort(UserPort userPort) {
		this.userPort = userPort;
	}
}
