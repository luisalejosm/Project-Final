package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
