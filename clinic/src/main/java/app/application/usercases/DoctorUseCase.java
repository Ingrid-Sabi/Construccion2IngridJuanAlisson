package app.application.usercases;

import java.util.List;

import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.services.CreateDoctor;

public class DoctorUseCase {
	
	private CreateDoctor createDoctor;
	private ClinicalOrder clinicalOrder;
	private ClinicalRecord clinicalRecord;
	
	public void createOrder(ClinicalOrder order) throws Exception {
		Object createClinicalOrder;
		createClinicalOrder.create(order);
	}
	
	public List<ClinicalOrder> searchOrders(Patient patient) throws Exception{
		return SearchClinicalOrder.search(patient);
	}
	
	public void createClinicalRecord(ClinicalRecord clinicalRecord) throws Exception {
		Object createClinicalRecord;
		createClinicalRecord.create(clinicalRecord);
	}
	
	public void updateClinicalRecord(ClinicalRecord clinicalRecord) throws Exception{
        updateClinicalRecord.update(clinicalRecord);
    }

}
