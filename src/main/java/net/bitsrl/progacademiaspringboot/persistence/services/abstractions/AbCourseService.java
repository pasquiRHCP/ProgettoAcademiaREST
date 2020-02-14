package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.CourseEdition;

import java.util.List;


public interface AbCourseService {

    List<Course> findAllCourse();

    List<Course> findCourseByTitle(String pattern);

    Course findCourseById(Integer id);

    Course saveCourse(Course toInsert);

    void deleteCourseById(int id);

//--------------------------------------COURSE EDITION----------------------------------------------

    List<CourseEdition> findAllCourseEdition();

    CourseEdition findCourseEditionById(Integer id);

    CourseEdition saveCourseEdition(CourseEdition toInsert);

    void deleteCourseEditionById(int id);

}
