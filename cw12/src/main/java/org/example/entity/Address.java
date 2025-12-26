package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Address extends  BaseEntity<Integer> {
    @Column
    private int postalCode;

    @Column
    private String postalAddress;

    @Column
    private String city;

    @ManyToOne
    private Employee employee;

    @ElementCollection
    private Set<PhoneNumber> phoneNumbers = new HashSet<>();
}
