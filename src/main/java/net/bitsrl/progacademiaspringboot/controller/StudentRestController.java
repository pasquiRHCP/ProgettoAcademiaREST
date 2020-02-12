package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.dto.EnrollmentDto;
import net.bitsrl.progacademiaspringboot.dto.StudentDto;
import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
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
//        List<StudentDto> studentsDto = students.stream()
//                                       .map(s -> new StudentDto(s)).collect(Collectors.toList());
//
        List<StudentDto> studentsDto = students.stream()
                .map(StudentDto::new).collect(Collectors.toList());

        return studentsDto;
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Integer id){
        Student student = studentService.getStudentById(id);
        StudentDto studentDto = new StudentDto(student);
        return studentDto;
    }

    @PostMapping("/students")
    public StudentDto createStudent(@RequestBody StudentDto dto) {
        Student student = dto.toStudent();
        studentService.studentCreateOrUpdate(student);
        return new StudentDto(student);
    }

    @PutMapping("/students")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto){
        Student student = studentDto.toStudent();
        Student edited = studentService.studentCreateOrUpdate(student);
        return new StudentDto(edited);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.studentDelete(id);
    }

//----------------------------------------------------------------------------------------------------------------------
    //ENROLLMENT
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
    public EnrollmentDto updateEnrollment(@RequestBody EnrollmentDto enrollmentDto){
        Enrollment enrollment = enrollmentDto.toEnrollment();
        studentService.enrollmentCreateOrUpdate(enrollment);
        return enrollmentDto;
    }

    @DeleteMapping("/enrollments/{id}")
    public void deleteEnrollment(@PathVariable Integer id){
        studentService.enrollmentDelete(id);
    }

    @GetMapping("/students/{id}/enrollments")
    public List<EnrollmentDto> getStudentAndEnrollment(@PathVariable int id) {
        List<Enrollment> enrollments = studentService.findByStudentId(id);
        for (Enrollment e: enrollments
        ) {
            System.out.println(e);
        }
        List<EnrollmentDto> enrollmentsDto = enrollments.stream().
                map(EnrollmentDto::new).collect(Collectors.toList());
        return enrollmentsDto;
    }
}
