package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.dto.CourseDto;
import net.bitsrl.progacademiaspringboot.dto.CourseEditionDto;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.CourseEdition;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.AbCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CourseRestController {
    private AbCourseService service;

    @Autowired
    public CourseRestController(AbCourseService abCourseService) {
        service = abCourseService;
    }

    @GetMapping("/courses")
    public List<CourseDto> getAllCourse() throws DataException {

        List<Course> courses = service.findAllCourse();

        List<CourseDto> coursesDto = courses.stream()
                .map(CourseDto::new).collect(Collectors.toList());
        return coursesDto;
    }

    @GetMapping("/courses/{title}")
    public List<CourseDto> getCourseByTitle(@PathVariable String title){
        List<Course> courses = service.findCourseByTitle( title );

        List<CourseDto> coursesByTitleDto = courses.stream()
                .map(CourseDto::new).collect(Collectors.toList());
        return coursesByTitleDto;
    }

    @PostMapping("/courses")
    public CourseDto createCourse(@RequestBody CourseDto dto) {
        Course course = dto.toCourse();
        service.saveCourse(course);
        return new CourseDto(course);
    }

    @PutMapping("/courses")
    public CourseDto updateCourse(@RequestBody CourseDto dto){
        Course course = dto.toCourse();
        service.saveCourse(course);
        return dto;
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Integer id){
        service.deleteCourseById(id);
    }

    //------------------------------------------------------------------------------------------------------------------
    //COURSE EDITION

    @GetMapping("/courseEditions")
    public List<CourseEditionDto> getAllCourseEdition() throws DataException {

        List<CourseEdition> courseEditions = service.findAllCourseEdition();
        List<CourseEditionDto> courseEditionsDto = courseEditions.stream()
                .map(CourseEditionDto::new).collect(Collectors.toList());
        return courseEditionsDto;
    }

    @GetMapping("/courseEditions/{id}")
    public CourseEditionDto getCourseEditionById(@PathVariable int id){
        CourseEdition courseEdition = service.findCourseEditionById(id);
        CourseEditionDto courseEditionDto = new CourseEditionDto(courseEdition);
        return courseEditionDto;
    }

    @PostMapping("/courseEditions")
    public CourseEditionDto createCourseEdition(@RequestBody CourseEditionDto dto) {
        CourseEdition courseEdition = dto.toCourseEdition();
        service.saveCourseEdition(courseEdition);
        return new CourseEditionDto(courseEdition);
    }

    @PutMapping("/courseEditions")
    public CourseEditionDto updateCourseEdition(@RequestBody CourseEditionDto dto){
        CourseEdition courseEdition = dto.toCourseEdition();
        service.saveCourseEdition(courseEdition);
        return dto;
    }

    @DeleteMapping("/courseEditions/{id}")
    public void deleteCourseEdition(@PathVariable Integer id){
        service.deleteCourseEditionById(id);
    }
}
