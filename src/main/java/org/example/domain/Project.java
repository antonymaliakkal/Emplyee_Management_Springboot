package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "projects")
public class Project {

    @Id
    private int projectId;
    private LocalDate startDate;
    private String title;

    @ManyToMany(mappedBy = "projects" , fetch = FetchType.LAZY)
    private Set<Employee> employee;



}
