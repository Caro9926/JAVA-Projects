package com.model;
import com.caresoft.clinicapp.UsuarioCompatibleConHIPAA;
import java.util.ArrayList;
import java.sql.Date;
public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {

	private ArrayList<String> patientNotes;
	
	
	
	public Physician(Integer id) {
		super(id, id);
		
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format(
	            "Fecha y hora de envío: %s \n", date);
	        report += String.format("Reportado por ID: %s\n", this.id);
	        report += String.format("Nombre del paciente: %s\n", patientName);
	        report += String.format("Notas: %s \n", notes);
	        this.patientNotes.add(report);
	}



	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() == 4) {
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmID) {
		if (this.getId() == confirmID) {
			return true;
		}
		return false;
	}
}