package com.jpql.repo;

import com.jpql.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepo extends JpaRepository<Driver, Long> {

    @Query("select d from Driver d")
    List<Driver> getAllDrivers();

}
