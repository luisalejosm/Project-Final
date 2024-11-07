package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
