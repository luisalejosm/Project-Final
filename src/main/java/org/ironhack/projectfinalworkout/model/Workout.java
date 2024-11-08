package org.ironhack.projectfinalworkout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

//    @OneToMany(mappedBy = "Workout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Exercise> exercises = new HashSet<>();
}
