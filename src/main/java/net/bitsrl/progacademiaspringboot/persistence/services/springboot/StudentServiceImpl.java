package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.EnrollmentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.StudentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

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

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
