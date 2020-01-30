package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CourseAbRepository extends JpaRepository<Course, Integer> {
    //inserire metodi particolari
}
