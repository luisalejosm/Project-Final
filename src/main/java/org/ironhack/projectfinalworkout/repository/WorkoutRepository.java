package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    List<Workout> findAll ();




}
