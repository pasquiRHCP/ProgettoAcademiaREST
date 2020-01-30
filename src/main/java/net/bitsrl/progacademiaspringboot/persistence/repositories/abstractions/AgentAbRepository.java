package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface AgentAbRepository extends JpaRepository<Agent, Integer> {
    //inserire metodi particolari
}
