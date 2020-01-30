package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbStudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentRestController {

    private AbStudentService enrollmentAndStudentService;

    @Autowired
    public EnrollmentRestController(StudentService studentService) {
        this.enrollmentAndStudentService = studentService;
    }

}
