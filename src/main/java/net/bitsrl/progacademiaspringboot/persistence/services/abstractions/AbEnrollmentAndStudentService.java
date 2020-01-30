package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Student;

import java.util.List;

public interface AbEnrollmentAndStudentService {
    //inserire metodi particolari
    List<Student> studentsGetAll();
}
