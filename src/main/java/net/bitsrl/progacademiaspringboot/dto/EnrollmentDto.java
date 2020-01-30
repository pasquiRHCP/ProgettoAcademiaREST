package net.bitsrl.progacademiaspringboot.dto;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class EnrollmentDto {

    private StudentService service;

    @Autowired
    public EnrollmentDto(StudentService service) {
        this.service = service;
    }

    void crea(Enrollment toInsert) {
    }

}
