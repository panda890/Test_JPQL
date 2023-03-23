package com.jpql.service;

import com.jpql.model.Driver;
import com.jpql.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepo repo;

    public Driver addDriver(Driver driver){
       return repo.saveAndFlush(driver);
       ////// saregamapa
    }
    public List<Driver> getAllDriverss(){
        return repo.getAllDrivers();
    }

}
