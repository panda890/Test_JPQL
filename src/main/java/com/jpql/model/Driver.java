package com.jpql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Driver {

    @Id
    private  Long phoneNo;

    private String driverName;

    private  String driverAddress;

}
