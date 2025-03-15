package com.leopoldhsing.patient.mapper;

import com.leopoldhsing.patient.dto.PatientDto;
import com.leopoldhsing.patient.dto.PatientRequestDto;
import com.leopoldhsing.patient.model.Patient;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class PatientMappers {

    public static PatientDto toPatientDto(Patient patient) {
        PatientDto patientDto = new PatientDto();
        BeanUtils.copyProperties(patient, patientDto);
        patientDto.setId(patient.getId().toString());
        return patientDto;
    }

    public static Patient toPatient(PatientRequestDto patientRequestDto) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientRequestDto, patient);
        patient.setDateOfBirth(LocalDate.parse(patientRequestDto.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDto.getRegisteredDate()));

        return patient;
    }

}
