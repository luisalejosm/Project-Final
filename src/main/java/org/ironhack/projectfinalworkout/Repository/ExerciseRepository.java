package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
