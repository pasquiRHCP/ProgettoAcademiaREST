package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.CourseEdition;

import java.util.List;


public interface AbCourseService {

    List<Course> findAllCourse();

    List<Course> findCourseByTitle(String pattern);

    void saveCourse(Course toInsert);

    void deleteCourseById(int id);

//--------------------------------------COURSE EDITION----------------------------------------------

    List<CourseEdition> findAllCourseEdition();

    //CourseEdition findCourseEditionById(int id);

    void saveCourseEdition(CourseEdition toInsert);

    void deleteCourseEditionById(int id);

}
