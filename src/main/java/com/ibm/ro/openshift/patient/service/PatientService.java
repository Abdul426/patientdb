package com.ibm.ro.openshift.patient.service;

import com.ibm.ro.openshift.patient.model.Patient;

public interface PatientService {

	public Patient getPatient(Long pId);

	public Patient createPatient(Patient patient);
}
