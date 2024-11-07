package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
