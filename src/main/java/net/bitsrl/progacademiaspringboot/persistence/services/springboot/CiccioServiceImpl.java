package net.bitsrl.progacademiaspringboot.persistence.services.springboot;

import net.bitsrl.progacademiaspringboot.persistence.services.abstractions.CiccioService;

public class CiccioServiceImpl implements CiccioService {

    @Override
    public double somma(double first, double second) {
        return first+second;
    }
}
