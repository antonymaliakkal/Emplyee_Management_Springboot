package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor

@Entity
@Table(name = "employees" , uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
//@DiscriminatorColumn(name = "empType" , discriminatorType = DiscriminatorType.STRING )
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    private String fullName;
    private String email;

    //Address
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Address> address;

    //Access Card
    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "access_card_id",referencedColumnName = "cardId")
    private AccessCard accessCard;

    //Projects
    @ManyToMany
    @JoinTable(
            name = "employee_project", // Join table name
            joinColumns = @JoinColumn(name = "employee_id"), // Foreign key in the join table for Employee
            inverseJoinColumns = @JoinColumn(name = "project_id") // Foreign key in the join table for Project
    )
    private Set<Project> projects;
}
