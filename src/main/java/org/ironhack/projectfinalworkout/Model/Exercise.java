package org.ironhack.projectfinalworkout.Model;

import jakarta.persistence.*;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Integer repetitions;

    @ManyToOne
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;
}
