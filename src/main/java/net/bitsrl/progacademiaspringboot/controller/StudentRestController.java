package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    private AbStudentService abStudentService;

    @Autowired
    public StudentRestController(AbStudentService abStudentService) {
        this.abStudentService = abStudentService;
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() throws DataException {
        List<Student> students = abStudentService.studentsGetAll();
        return students;
    }

    @PostMapping("/create")
    public Student createStudent(Student student) throws DataException {
        abStudentService.studentCreateOrUpdate(student);
        return student;
    }

    @PostMapping("/update")
    public Student updateStudent(Integer idStudent, Student student){
        abStudentService.studentCreateOrUpdate(student);
        return student;
    }

    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        abStudentService.studentDelete(id);
    }
}
