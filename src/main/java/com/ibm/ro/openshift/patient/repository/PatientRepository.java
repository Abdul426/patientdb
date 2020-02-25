package com.ibm.ro.openshift.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.ro.openshift.patient.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
