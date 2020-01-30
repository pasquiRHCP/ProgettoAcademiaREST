package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;


import net.bitsrl.progacademiaspringboot.model.CourseEdition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseEditionAbRepository extends JpaRepository<CourseEdition, Integer> {
    //inserire metodi particolari

}
