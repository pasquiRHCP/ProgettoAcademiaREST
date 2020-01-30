package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public List<Student> getAllStudents() throws DataException {
        List<Student> students = abEnrollmentAndStudentService.studentsGetAll();
        return students;
    }

    @PostMapping("/create")
    public Student createStudent(Student student) throws DataException {
        abEnrollmentAndStudentService.studentCreateOrUpdate(student);
        return student;
    }

    @PostMapping("/update")
    public Student updateStudent(Integer idStudent, Student student){
        abEnrollmentAndStudentService.studentCreateOrUpdate(student);
        return student;
    }

    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        abEnrollmentAndStudentService.studentDelete(id);
    }
}
