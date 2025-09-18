package app.application.usercases;

import app.domain.model.Appointment;
import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.services.CreateDoctor;
import app.domain.services.CreateUser;

public class AdminUseCase {
	
	private CreateInvoice createInvoice;
	
	
	public void createPatient(Patient patient) throws Exception {
        createPatient.createPatient(patient);
    }

    public void createMedicalAppointment(Patient patient) throws Exception {
        Appointment.createMedicalAppointment(patient);
    }

    public void createInvoice(Invoice invoice) throws Exception {
        createInvoice.createInvoice(invoice);
    }

    public void update(Patient patient) throws Exception {
        AdminUseCase updatePatient;
		updatePatient.update(patient);
    }
	
	

}

