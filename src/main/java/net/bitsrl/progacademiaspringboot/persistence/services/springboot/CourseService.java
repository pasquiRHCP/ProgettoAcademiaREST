package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.CourseEdition;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.CourseAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.CourseEditionAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements AbCourseService {

    @Autowired
    private CourseAbRepository courseRepo;
    @Autowired
    private CourseEditionAbRepository courseEditionRepo;

    //---------------------------------------------------------------------------------------------------------------------
    //COURSE
    @Override
    public List<Course> findAllCourse() {
        return courseRepo.findAll();
    }

    @Override
    public List<Course> findCourseByTitle(String pattern) {
        return courseRepo.findByTitleContains(pattern);
    }

    @Override
    public Course saveCourse(Course toInsert) {
        return courseRepo.save(toInsert);
    }

    @Override
    public void deleteCourseById(int id) {
        courseRepo.deleteById(id);
    }

    //----------------------------------------------------------------------------------------------------------------------
    //COURSE EDITION
    @Override
    public List<CourseEdition> findAllCourseEdition() {
        return courseEditionRepo.findAll();
    }

    @Override
    public CourseEdition findCourseEditionById(Integer id) {
        return courseEditionRepo.getOne(id);
    }

    @Override
    public CourseEdition saveCourseEdition(CourseEdition toInsert) {
        return courseEditionRepo.save(toInsert);
    }

    @Override
    public void deleteCourseEditionById(int id) {
        courseEditionRepo.deleteById(id);
    }
}
