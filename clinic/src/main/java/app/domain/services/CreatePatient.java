package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreatePatient {
	private PatientPort patientPort;
	private UserPort userPort;
	public void create(Patient patient) throws Exception {
		if (PatientPort.findByDocument(patient) != null) {
			throw new Exception("ya existe una persona registrado con esa cedula");
		}

		if (patientPort.findByUserName(patient) != null) {
			throw new Exception("ya existe una persona registrada con ese nombre de usuario");
		}
		patientPort.save(patient);
	}

}
