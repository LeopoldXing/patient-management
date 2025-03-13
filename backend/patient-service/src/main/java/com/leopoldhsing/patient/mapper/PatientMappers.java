package com.leopoldhsing.patient.mapper;

import com.leopoldhsing.patient.dto.PatientDto;
import com.leopoldhsing.patient.model.Patient;
import org.springframework.beans.BeanUtils;

public class PatientMappers {

    public static PatientDto toPatientDto(Patient patient) {
        PatientDto patientDto = new PatientDto();
        BeanUtils.copyProperties(patient, patientDto);
        patientDto.setId(patient.getId().toString());
        return patientDto;
    }

}
