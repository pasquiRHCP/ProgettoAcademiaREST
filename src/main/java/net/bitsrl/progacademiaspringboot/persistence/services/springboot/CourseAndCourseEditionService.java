package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.CourseAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.CourseEditionAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseAndCourseEditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseAndCourseEditionService implements AbCourseAndCourseEditionService {

    @Autowired
    private CourseAbRepository courseRepo;
    @Autowired
    private CourseEditionAbRepository courseEditionRepo;

    public void newCourse(Course toInsert) {
        courseRepo.save(toInsert);
    }

}
