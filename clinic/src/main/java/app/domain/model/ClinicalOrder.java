package app.domain.model;

import java.sql.Date;
import java.util.List;

public class ClinicalOrder {
	private long id; 
	private Patient document;
	private Date date;
	private User doctors;

	

	private List<Item> items;
	
public void estoSeBorraPorqueEsUnEjemplo() {
	items.add(new MedicalItem());
	items.add(new ProcedureItem());}

}
