package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademyRestController {

    private AbCourseService courseService;
    private StudentService studentService;

    @Autowired
    public AcademyRestController(AbCourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
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
