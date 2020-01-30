package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class EnrollmentDto {

    private StudentServiceImpl service;

    @Autowired
    public EnrollmentDto(StudentServiceImpl service) {
        this.service = service;
    }

    void crea(Enrollment toInsert) {
    }

}
