package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.EnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentRestController {

    private AbEnrollmentAndStudentService enrollmentAndStudentService;

    @Autowired
    public EnrollmentRestController(EnrollmentAndStudentService enrollmentAndStudentService) {
        this.enrollmentAndStudentService = enrollmentAndStudentService;
    }

    public void crea(Enrollment toInsert) {
        EnrollmentAndStudentService.
    }

}
