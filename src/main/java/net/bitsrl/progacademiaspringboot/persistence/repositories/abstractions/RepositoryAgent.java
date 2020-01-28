package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;

import java.util.Collection;

public interface RepositoryAgent {
    Agent create(Agent toInsert) throws DataException;
    boolean delete(int agentId) throws DataException;
    boolean update(int agentId, Agent toUpdate) throws DataException;
    Collection<Agent> getAll() throws DataException;
    Collection<Agent> getByLastnameLike(String pattern) throws DataException;
}
