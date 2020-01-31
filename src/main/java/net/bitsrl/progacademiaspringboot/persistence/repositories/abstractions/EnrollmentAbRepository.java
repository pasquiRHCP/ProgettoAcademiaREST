package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentAbRepository extends JpaRepository<Enrollment, Integer> {
    //inserire metodi particolari
    List<Enrollment> findByStudentId(int id);
}
