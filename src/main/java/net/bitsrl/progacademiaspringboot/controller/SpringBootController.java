package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.HRServiceSB;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.HRServiceSB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@Controller
public class SpringBootController {

    private HRServiceSB HRServiceSpringBoot;

    @Autowired
    public SpringBootController(HRServiceSB hrServiceSB) {
        this.HRServiceSpringBoot = hrServiceSB;
    }


    @GetMapping("/agent")
    public String getAllAgent(Model mdl) throws DataException {
        Collection<Agent> agents = HRServiceSpringBoot.getAllAgents();
        //agents.forEach(System.out::println);
        mdl.addAttribute("Agents", agents);
        return "agent/allAgents";
    }



    @GetMapping("/course/formCreate")
    public String formCreate(Model mdl) throws DataException {

        Course c = new Course();
        mdl.addAttribute("course",c);

        return "/course/course-form";
    }
//WIP
    @PostMapping("/course/create")
    public String createCourse(@ModelAttribute("course") Course toInsert) throws DataException {
    HRServiceSpringBoot.createCourse(toInsert);

    return "redirect:/course";
    }

    @GetMapping("/course")
    public String getAllCourse(Model mdl) throws DataException {
        Collection<Course> courses = HRServiceSpringBoot.getAllCourses();
        //courses.forEach(System.out::println);
        mdl.addAttribute("Courses", courses);
        return "course/allCourses";
    }
}