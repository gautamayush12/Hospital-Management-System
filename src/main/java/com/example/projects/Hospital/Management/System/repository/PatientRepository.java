package com.example.projects.Hospital.Management.System.repository;

import com.example.projects.Hospital.Management.System.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
