package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.EnrollmentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.StudentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbEnrollmentAndStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentAndStudentService implements AbEnrollmentAndStudentService {

    @Autowired
    private StudentAbRepository studentRepo;
    @Autowired
    private EnrollmentAbRepository enrollmentRepo;

    public List<Student> studentsGetAll(){
        return studentRepo.findAll();
    }
}
