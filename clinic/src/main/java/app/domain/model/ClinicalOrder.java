package app.domain.model;

import java.util.List;

public class ClinicalOrder {
/*id
paciente
fecha
medico*/
	private List<Item> items;
	
public void estoSeBorraPorqueEsUnEjemplo() {
	items.add(new MedicalItem());
	items.add(new ProcedureItem());}

}
