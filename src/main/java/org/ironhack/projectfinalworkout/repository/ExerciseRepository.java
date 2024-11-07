package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
