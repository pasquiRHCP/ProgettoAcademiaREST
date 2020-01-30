package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentRestController {

    private AbEnrollmentAndStudentService enrollmentAndStudentService;

    @Autowired
    public EnrollmentRestController(StudentService studentService) {
        this.enrollmentAndStudentService = studentService;
    }

}
