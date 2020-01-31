package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;

import java.util.List;

public interface StudentService {
    //inserire metodi particolari
    Student studentCreateOrUpdate(Student student);
    void studentDelete(Integer id);
    List<Student> getAllStudents();
    Student getStudentById(Integer id);


    Enrollment enrollmentCreateOrUpdate(Enrollment enrollment);
    void enrollmentDelete(Integer id);
    List<Enrollment> getAllEnrollment();
}
