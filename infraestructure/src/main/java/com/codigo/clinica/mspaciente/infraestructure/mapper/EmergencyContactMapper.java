package com.codigo.clinica.mspaciente.infraestructure.mapper;

import com.codigo.clinica.mspaciente.domain.aggregates.dto.EmergencyContactDto;
import com.codigo.clinica.mspaciente.infraestructure.entity.EmergencyContact;

public class EmergencyContactMapper {
    public static EmergencyContactDto fromEntity(EmergencyContact entity){
        return EmergencyContactDto.builder()
                .id(entity.getId())
                .phone(entity.getPhone())
                .relation(entity.getRelation())
                .name(entity.getName())
//                .patient(PatientMapper.fromEntity(entity.getPatient())) //Problema de blucle infinito
                .status(entity.getStatus())
                .createdBy(entity.getCreatedBy())
                .createOn(entity.getCreatedOn())
                .updatedBy(entity.getUpdatedBy())
                .updatedOn(entity.getUpdatedOn())
                .deletedBy(entity.getDeletedBy())
                .deletedOn(entity.getDeletedOn())
                .build();
    }
}
