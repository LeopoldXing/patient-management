package com.leopoldhsing.patient.service;

import com.leopoldhsing.patient.dto.PatientDto;
import com.leopoldhsing.patient.dto.PatientRequestDto;
import com.leopoldhsing.patient.mapper.PatientMappers;
import com.leopoldhsing.patient.model.Patient;
import com.leopoldhsing.patient.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientDto> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMappers::toPatientDto).toList();
    }

    public PatientDto savePatient(PatientRequestDto patientRequestDto) {
        Patient savedPatient = patientRepository.save(PatientMappers.toPatient(patientRequestDto));

        return PatientMappers.toPatientDto(savedPatient);
    }
}
