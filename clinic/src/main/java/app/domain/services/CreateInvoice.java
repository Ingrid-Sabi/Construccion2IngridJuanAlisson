package app.domain.services;

import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.ports.PatientPort;


public class CreateInvoice {
	
	private PatientPort patientPort;
	
	
	public void create(Invoice invoice) throws Exception {
		Patient patient = patientPort.findByDocument(invoice.getPatientName());
		if(patient == null) {
			throw new Exception("la factura debe tener un paciente asociado");
		}
	}	

}
