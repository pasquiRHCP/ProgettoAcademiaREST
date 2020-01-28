package net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions;

import net.bitsrl.progacademiaspringboot.model.Course;
import net.bitsrl.progacademiaspringboot.persistence.repositories.DataException;

import java.util.Collection;

public interface RepositoryCourse {
    Course create(Course toInsert) throws DataException;
    boolean delete(int courseId) throws DataException;
    boolean update(int courseId, Course toUpdate) throws DataException;
    Collection<Course> getAll() throws DataException;
    Collection<Course> getByTitleLike(String pattern) throws DataException;
}
