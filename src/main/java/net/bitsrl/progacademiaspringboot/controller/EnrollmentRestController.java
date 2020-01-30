package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentRestController {

    private AbEnrollmentAndStudentService EnrollmentAndStudentService;

    @Autowired
    public EnrollmentRestController(AbEnrollmentAndStudentService EnrollmentAndStudentService) {
        this.EnrollmentAndStudentService = EnrollmentAndStudentService;
    }

        

}
