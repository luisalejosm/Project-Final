package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
