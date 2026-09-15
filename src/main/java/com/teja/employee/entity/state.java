package com.teja.employee.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "State")
public class state {
    @Id
    @Column(name = "state_id")
    private Integer stateId;

    @Column(name = "state_name", nullable = false, unique = true)
    private String stateName;

    public state() {
    }

}
