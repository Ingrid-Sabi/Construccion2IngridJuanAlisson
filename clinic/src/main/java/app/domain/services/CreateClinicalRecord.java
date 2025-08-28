package app.domain.services;

import app.domain.model.ClinicalRecord;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.UserPort;

public class CreateClinicalRecord {
	
	private UserPort userPort;
	
	public void create(ClinicalRecord clinicalRecord) throws Exception{
		User doctor = userPort.findByDocument(clinicalRecord.getDoctors());
		if(doctor==null || !doctor.getRole().equals(Role.DOCTORS)) {
			throw new Exception("la historia clinica se debe registrar por un doctor valido");
		}
	}


}
