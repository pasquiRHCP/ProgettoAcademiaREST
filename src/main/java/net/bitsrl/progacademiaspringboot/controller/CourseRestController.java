package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseRestController {
    private AbCourseService service;

    @Autowired
    public CourseRestController(AbCourseService abCourseService) {
        service = abCourseService;
    }

    @GetMapping("/getall")
    public List<Course> getAllCourse() throws DataException {
        List<Course> courses = service.findAllCourse();
        return courses;
    }

    @PostMapping("/create")
    public void createCourse(@RequestBody Course toInsert) throws DataException {
        service.saveCourse(toInsert);
    }

    @PostMapping("/update")
    public void updateCourse(Course toInsert) {
        service.saveCourse(toInsert);
    }

    @GetMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        service.deleteCourseById(id);
    }
}
