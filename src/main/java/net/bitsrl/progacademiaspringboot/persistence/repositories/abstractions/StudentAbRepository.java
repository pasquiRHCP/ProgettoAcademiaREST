package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface StudentAbRepository extends JpaRepository<Student, Integer> {
    //inserire metodi particolari

}
