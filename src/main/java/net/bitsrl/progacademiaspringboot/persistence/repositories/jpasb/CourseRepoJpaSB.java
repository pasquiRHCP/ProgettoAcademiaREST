package net.bitsrl.progacademiaspringboot.persistence.repositories.jpasb;

import net.bitsrl.progacademiaspringboot.model.Agent;
import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.RepositoryCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Collection;

@Repository
public class CourseRepoJpaSB implements RepositoryCourse {
    private EntityManager em;

    @Autowired
    public CourseRepoJpaSB (EntityManager entityManager) {em = entityManager;}

    @Override
    public Course create(Course toInsert) throws DataException {
        em.persist(toInsert);
        return toInsert;
    }

    @Override
    public boolean delete(int courseId) {
        Course toDelete = em.getReference(Course.class, courseId);
        em.remove(toDelete);
        return true;
    }

    @Override
    public boolean update(int courseId, Course toUpdate) {
        Course updated = em.merge(toUpdate);
        return true;
    }

    @Override
    public Collection<Course> getAll() {
        Query q = em.createQuery("select a from Course a");
        Collection <Course> courses = q.getResultList();
        System.out.println("AAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBXXXXXXXXXXXXXXXXXXXXXX");
        return courses;
    }

    @Override
    public Collection<Course> getByTitleLike(String pattern) {
        TypedQuery q = em.createQuery("select a from Course a where a.title LIKE :pattern", Course.class);
        q.setParameter("pattern", "%" + pattern + "%");
        return q.getResultList();
    }
}