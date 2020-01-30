package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.dto.StudentDto;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getall")
    public List<StudentDto> getAllStudents() throws DataException {
        List<Student> students = studentService.getAllStudents();
//        List<StudentDto> studentsDto = new ArrayList<StudentDto>();
//        for (Student s: students) {
//            studentsDto.add(new StudentDto(s));
//        }
//        List<StudentDto> studentDtos = students.stream()
//                                       .map(s -> new StudentDto(s)).collect(Collectors.toList());
//
        List<StudentDto> studentDtos = students.stream()
                .map(StudentDto::new).collect(Collectors.toList());

        return studentDtos;
    }

    @PostMapping("/create")
    public StudentDto createStudent(@RequestBody StudentDto dto) throws DataException {
        Student student = dto.toStudent();
        studentService.studentCreateOrUpdate(student);
        return new StudentDto(student);
    }

    @PostMapping("/update")
    public Student updateStudent(Integer idStudent, Student student){
        studentService.studentCreateOrUpdate(student);
        return student;
    }

    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.studentDelete(id);
    }
}
