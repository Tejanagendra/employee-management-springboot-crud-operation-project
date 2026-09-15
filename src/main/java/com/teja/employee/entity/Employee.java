package com.teja.employee.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private state state;

    public Employee() {
    }

    // Getters and Setters
}