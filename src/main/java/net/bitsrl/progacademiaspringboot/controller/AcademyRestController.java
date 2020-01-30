package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AcademyRestController {

    private OLD_HRServiceSB HRServiceSpringBoot;
    @Autowired
    public AcademyRestController(OLD_HRServiceSB OLDHrServiceSB) {
        this.HRServiceSpringBoot = OLDHrServiceSB;
    }

    //---------------------------------------student--------------------------------------------------------------------
    @GetMapping("/student")
    public String getAllStudent(Model mdl) throws DataException {
        Collection<Student> students = HRServiceSpringBoot.getAllStudent();
        mdl.addAttribute("Students", students);
        return "student/allStudent";
    }

//    @GetMapping("/student/formCreate")
//    public String formCreateStudent(Model mdl) throws DataException {
//        Student s = new Student();
//        mdl.addAttribute("student",s);
//        return "/student/course-form";
//    }



    @PostMapping("/student/create")
    public String createStudent(@ModelAttribute("student") Student toInsert) throws DataException {
        HRServiceSpringBoot.createStudent(toInsert);
        return "redirect:/student";
    }

}
