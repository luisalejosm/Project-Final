package org.ironhack.projectfinalworkout.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "Workout", cascade = CascadeType.ALL)
    private Set<Exercise> exercises = new HashSet<>();
}
