package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    private AbEnrollmentAndStudentService abEnrollmentAndStudentService;

    @Autowired
    public StudentRestController(AbEnrollmentAndStudentService abEnrollmentAndStudentService) {
        this.abEnrollmentAndStudentService = abEnrollmentAndStudentService;
    }


    @GetMapping("/getall")
    public List<Student> getAllStudents(Model mdl) throws DataException {
        List<Student> students = abEnrollmentAndStudentService.studentsGetAll();
        mdl.addAttribute("Students", students);
        return students;
    }

//    @PostMapping("/student/create")
//    public String createStudent(@ModelAttribute("student") Student toInsert) throws DataException {
//        HRServiceSpringBoot.createStudent(toInsert);
//        return "redirect:/student";
//    }

}
