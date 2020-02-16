package net.bitsrl.progacademiaspringboot;


import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.CiccioService;
import net.bitsrl.progacademiaspringboot.persistence.services.springboot.CiccioServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CiccioServiceTest {
    @Test
    public void testSum(){
        CiccioService cs = new CiccioServiceImpl();
        double result = cs.somma(1.0,2.0);
        assertEquals(3.0, result);
    }
}
