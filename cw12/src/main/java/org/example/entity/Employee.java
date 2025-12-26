package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Employee extends  BaseEntity<Integer> {
    @Column
    private String name;

    @Column
    private int empCode;

    @Column
    private int salary;

    @OneToMany(mappedBy = "employee")
    private Set<Address> addresses = new HashSet<>();
}
