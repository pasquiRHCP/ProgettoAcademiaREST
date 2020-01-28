package net.bitsrl.progacademiaspringboot.controller;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.HRServiceSB;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.HRServiceSB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String getAllAgent() throws DataException {
        Collection<Agent> agents = HRServiceSpringBoot.getAllAgents();
        agents.forEach(System.out::println);
        return "agent/allAgents";
    }
}


