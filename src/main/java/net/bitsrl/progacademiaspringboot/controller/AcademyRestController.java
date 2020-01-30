package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.EnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AcademyRestController {

    private AbCourseAndCourseEditionService CourseAndCourseEditionService;
    private AbEnrollmentAndStudentService EnrollmentAndStudentService;

    @Autowired
    public AcademyRestController(AbCourseAndCourseEditionService CourseAndCourseEditionService, AbEnrollmentAndStudentService EnrollmentAndStudentService) {
        this.CourseAndCourseEditionService = CourseAndCourseEditionService;
        this.EnrollmentAndStudentService = EnrollmentAndStudentService;
    }


    //---------------------------------------student--------------------------------------------------------------------
//    @GetMapping("/student")
//    public String getAllStudent(Model mdl) throws DataException {
//        Collection<Student> students = HRServiceSpringBoot.getAllStudent();
//        mdl.addAttribute("Students", students);
//        return "student/allStudent";
//    }
//
//    @PostMapping("/student/create")
//    public String createStudent(@ModelAttribute("student") Student toInsert) throws DataException {
//        HRServiceSpringBoot.createStudent(toInsert);
//        return "redirect:/student";
//    }

}
