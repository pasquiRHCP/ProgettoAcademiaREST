package net.bitsrl.progacademiaspringboot.persistence.services.abstractions;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;

import java.util.Collection;
import java.util.List;

public interface HRServiceSB {
    Agent createAgent(Agent toInsert) throws DataException;

    boolean deleteAgent(int agentId) throws DataException;

    boolean updateAgent(int agentId, Agent toUpdate) throws DataException;

    Collection<Agent> getAllAgents() throws DataException;

    Collection<Agent> getAgentsByLastNameLike(String pattern) throws DataException;


    //-----------------------------------------------------------------------------------------------------------------
    //CORSOOOOOOOO
    Course createCourse(Course toInsert) throws DataException;

    boolean updateCourse(int courseId, Course toUpdate) throws DataException;

    boolean deleteCourse(int courseId) throws DataException;

    Collection<Course> getAllCourses() throws DataException;

    Collection<Course> getCoursesByTitleLike(String pattern) throws DataException;
}

