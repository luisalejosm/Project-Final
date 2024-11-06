package org.ironhack.projectfinalworkout.Model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "Workout", cascade = CascadeType.ALL)
    private Set<Exercise> exercises = new HashSet<>();
}
