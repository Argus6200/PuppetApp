package org.example.puppetapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Performer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String permissionLevel;

    //@OneToMany(mappedBy = "performer")
    //private Set<Part> parts = new HashSet<>();
}