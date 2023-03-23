package com.jpql.cont;

import com.jpql.model.Driver;
import com.jpql.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverCont {
    @Autowired
    private DriverService service;

    @PostMapping(value = "/add")
    public Driver addDriver(@RequestBody Driver driver){
        return service.addDriver(driver);
    }

    @GetMapping(value = "/get")
    public List<Driver> getAllDriver(){
        return service.getAllDriverss();
    }
}
