package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.model.Area;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.model.Project;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.repositories.jpasb.AgentRepoJpaSB;
import net.bitsrl.progacademiaspringboot.persistence.repositories.jpasb.CourseRepoJpaSB;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.HRServiceSB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class HRServiceSpringBoot implements HRServiceSB {
    @Autowired
    private AgentRepoJpaSB agentRepo;
    @Autowired
    private CourseRepoJpaSB courseRepo;

    @Transactional
    @Override
    public Agent createAgent(Agent toInsert) throws DataException {
        try {
            agentRepo.create(toInsert);
            return toInsert;
        } catch (PersistenceException pe) {
            throw new DataException("errore della creazione dell' agent con JPA", pe);
        }
    }

    @Transactional
    @Override
    public boolean deleteAgent(int agentId) throws DataException {
        try {
            agentRepo.delete(agentId);
            return true;
        } catch (PersistenceException pe) {
            throw new DataException("errore durante l'eliminazione dell' agent con JPA", pe);
        }
    }

    @Transactional
    @Override
    public boolean updateAgent(int agentId, Agent toUpdate) throws DataException {
        try {
            agentRepo.update(agentId, toUpdate);
            return true;
        } catch (PersistenceException pe) {
            throw new DataException("errore nell'aggiornamento dell' agent con JPA", pe);
        }
    }

    @Transactional
    @Override
    public Collection<Agent> getAllAgents() throws DataException {
            return agentRepo.getAll();

    }

    @Transactional
    @Override
    public Collection<Agent> getAgentsByLastNameLike(String pattern) throws DataException {
        try {
            return agentRepo.getByLastnameLike(pattern);
        } catch (PersistenceException pe) {
            throw new DataException("errore nella lista like su lastname dell' agent con JPA", pe);
        }
    }


    //-----------------------------------------------------------------------------------------------------------------
    //CORSOOOOOOOO
    private EntityManager em;
    @Transactional
    @Override
    public Course createCourse(Course toInsert) throws DataException{
        try {

            Area a = em.getReference(Area.class, 1);
            toInsert.setArea(a);
            Project p = em.getReference(Project.class, 1);
            toInsert.setProject(p);
            Course inserted = courseRepo.create(toInsert);

            em.getTransaction().commit();
            return inserted;
        } catch (PersistenceException pe) {
            em.getTransaction().rollback();
            throw new DataException("errore nella creazione di un nuovo corso con JPA", pe);
        }
    }

    @Transactional
    @Override
    public boolean deleteCourse(int courseId) throws DataException{
        em.getTransaction().begin();
        try {
            courseRepo.delete(courseId);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException pe) {
            em.getTransaction().rollback();
            throw new DataException("errore nella cancellazione del corso con JPA", pe);
        }
    }

    @Transactional
    @Override
    public boolean updateCourse(int courseId, Course toUpdate) throws DataException{
        em.getTransaction().begin();
        try {
            courseRepo.update(courseId, toUpdate);
            em.getTransaction().commit();
            return true;
        } catch (PersistenceException pe) {
            em.getTransaction().rollback();
            throw new DataException("errore nell'aggiornamento del corso con JPA",pe);
        }
    }

    @Transactional
    @Override
    public Collection<Course> getAllCourses() throws DataException{
            return courseRepo.getAll();

    }

    @Transactional
    @Override
    public Collection<Course> getCoursesByTitleLike(String pattern) throws DataException{
        try {
            return courseRepo.getByTitleLike(pattern);
        } catch (PersistenceException pe) {
            throw new DataException("errore nella lista corsi like title tramite JPA", pe);
        }
    }
}
