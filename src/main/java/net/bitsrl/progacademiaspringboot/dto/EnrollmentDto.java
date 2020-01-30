package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.EnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class EnrollmentDto {

    private EnrollmentAndStudentService service;

    @Autowired
    public EnrollmentDto(EnrollmentAndStudentService service) {
        this.service = service;
    }

    void crea(Enrollment toInsert) {
        service..newEnrollment(toInsert);
    }

}
