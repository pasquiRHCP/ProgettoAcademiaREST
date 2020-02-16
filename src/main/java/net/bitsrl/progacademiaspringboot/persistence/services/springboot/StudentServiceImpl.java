package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
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

//    @Autowired
    private StudentAbRepository studentRepo;
//    @Autowired
    private EnrollmentAbRepository enrollmentRepo;

    @Autowired
    public StudentServiceImpl(StudentAbRepository studentRepo, EnrollmentAbRepository enrollmentRepo) {
        this.enrollmentRepo = enrollmentRepo;
        this.studentRepo = studentRepo;
    }

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

    @Override
    public Student getStudentById(Integer id) {
        return studentRepo.getOne(id);
    }

    @Override
    public Enrollment enrollmentCreateOrUpdate(Enrollment enrollment) {
        return enrollmentRepo.save(enrollment);
    }

    @Override
    public void enrollmentDelete(Integer id) {
        enrollmentRepo.deleteById(id);
    }

    @Override
    public List<Enrollment> getAllEnrollment() {
        return enrollmentRepo.findAll();
    }

    @Override
    public List<Enrollment> findByStudentId(int id) {
        return enrollmentRepo.findByStudentId(id);
    }
}
