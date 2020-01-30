package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
