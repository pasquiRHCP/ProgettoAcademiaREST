package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.EnrollmentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.StudentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements AbStudentService {

    @Autowired
    private StudentAbRepository studentRepo;
    @Autowired
    private EnrollmentAbRepository enrollmentRepo;

    @Override
    public Student studentCreateOrUpdate(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void studentDelete(Integer id) {
        studentRepo.deleteById(id);
    }

    public List<Student> studentsGetAll(){
        return studentRepo.findAll();
    }
}
