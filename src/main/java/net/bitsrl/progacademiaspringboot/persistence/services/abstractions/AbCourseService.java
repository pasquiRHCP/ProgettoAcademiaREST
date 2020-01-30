package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.CourseEdition;

import java.util.Collection;

public interface AbCourseService {

    Collection<Course> findAllCourse();

    Collection<Course> findCourseByTitle(String pattern);

    void saveCourse(Course toInsert);

    void deleteCourseById(int id);

//--------------------------------------COURSE EDITION----------------------------------------------

    Collection<CourseEdition> findAllCourseEdition();

    //CourseEdition findCourseEditionById(int id);

    void saveCourseEdition(CourseEdition toInsert);

    void deleteCourseEditionById(int id);

}
