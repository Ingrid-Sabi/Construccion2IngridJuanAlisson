package app.domain.ports;

import app.domain.model.ClinicalRecord;

public interface ClinicalRecordPort {
	
	void save(ClinicalRecord clinicalRecord);

}
