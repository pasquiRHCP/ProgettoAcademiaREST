package net.bitsrl.progacademiaspringboot;

import net.bitsrl.progacademiaspringboot.model.Enrollment;
import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.StudentService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.StudentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentServiceTest {
    @Test
    public void testLoad(){
        StudentService sr = new StudentServiceImpl(null, new MockEnrollmentRepo());
        List<Enrollment> le = sr.getAllEnrollment();
        Assertions.assertEquals(2, le.size());
    }
}
