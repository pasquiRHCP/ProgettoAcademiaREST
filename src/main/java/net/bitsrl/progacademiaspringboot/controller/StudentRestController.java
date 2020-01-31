package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.dto.EnrollmentDto;
import net.bitsrl.progacademiaspringboot.dto.StudentDto;
import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentService studentService;
    private EnrollmentDto enrollmentDto;


    @Autowired
    public StudentRestController(StudentService studentService, EnrollmentDto enrollmentDto) {
        this.studentService = studentService;
        this.enrollmentDto = enrollmentDto;
    }

    @GetMapping("/students")
    public List<StudentDto> getAllStudents() {
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

    @PostMapping("/students")
    public StudentDto createStudent(@RequestBody StudentDto dto) {
        Student student = dto.toStudent();
        studentService.studentCreateOrUpdate(student);
        return new StudentDto(student);
    }

    @PutMapping("students")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto){
        Student student = studentDto.toStudent();
        studentService.studentCreateOrUpdate(student);
        return studentDto;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.studentDelete(id);
    }

    @GetMapping("/enrollments")
    public List<EnrollmentDto> getAllEnrollments(){
        List<Enrollment> enrollments = studentService.getAllEnrollment();
        List<EnrollmentDto> enrollmentsDto = enrollments.stream().
                map(EnrollmentDto::new).collect(Collectors.toList());
        return enrollmentsDto;
    }

    @PostMapping("/enrollments")
    public EnrollmentDto createEnrollment(@RequestBody EnrollmentDto enrollmentDto){
        Enrollment enrollment = enrollmentDto.toEnrollment();
        studentService.enrollmentCreateOrUpdate(enrollment);
        return new EnrollmentDto(enrollment);
    }

    @PutMapping("/enrollments")
    public Enrollment updateEnrollment(Enrollment enrollment){
        studentService.enrollmentCreateOrUpdate(enrollment);
        return enrollment;
    }

    @DeleteMapping("/enrollments/{id}")
    public void deleteEnrollment(@PathVariable Integer id){
        studentService.enrollmentDelete(id);
    }
}
