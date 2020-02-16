package net.bitsrl.progacademiaspringboot;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.model.Student;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.EnrollmentAbRepository;
import net.bitsrl.progacademiaspringboot.persistence.repositories.abstractions.StudentAbRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockEnrollmentRepo implements EnrollmentAbRepository {
    @Override
    public List<Enrollment> findByStudentId(int id) {
        return null;
    }

    @Override
    public List<Enrollment> findAll() {
        Enrollment e1 = new Enrollment();
        Enrollment e2 = new Enrollment();
        List<Enrollment> le = new ArrayList<Enrollment>();
        le.add(e1);
        le.add(e2);
        return le;
    }

    @Override
    public List<Enrollment> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Enrollment> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Enrollment> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Enrollment enrollment) {

    }

    @Override
    public void deleteAll(Iterable<? extends Enrollment> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Enrollment> S save(S s) {
        return null;
    }

    @Override
    public <S extends Enrollment> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Enrollment> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Enrollment> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Enrollment> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Enrollment getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Enrollment> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Enrollment> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Enrollment> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Enrollment> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Enrollment> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Enrollment> boolean exists(Example<S> example) {
        return false;
    }
}
