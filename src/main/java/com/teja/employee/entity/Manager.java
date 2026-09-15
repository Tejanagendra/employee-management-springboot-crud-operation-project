package com.teja.employee.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Manager")
public class Manager {

    @Id
    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "manager_name", nullable = false)
    private String managerName;

    public Manager() {
    }

}