package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.Routine;
import org.ironhack.projectfinalworkout.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoutineRepository extends JpaRepository<Routine, Long> {

    List<Routine> findAll ();
}
