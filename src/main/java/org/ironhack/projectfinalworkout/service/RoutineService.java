package org.ironhack.projectfinalworkout.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.ironhack.projectfinalworkout.model.Exercise;
import org.ironhack.projectfinalworkout.model.Routine;
import org.ironhack.projectfinalworkout.model.Workout;
import org.ironhack.projectfinalworkout.repository.ExerciseRepository;
import org.ironhack.projectfinalworkout.repository.RoutineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Slf4j
@Service
public class RoutineService {
    private final RoutineRepository routineRepository;


    @Autowired
    public RoutineService(RoutineRepository routineRepository){
        this.routineRepository = routineRepository;
    }

    public Routine saveRoutine(Routine routine){
        return routineRepository.save(routine);
    }

    public List<Routine> findAll(){
        return routineRepository.findAll();
    }

    public Routine update(Long id, Routine updateRoutine) {
        Routine existingRoutine = routineRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Routine not found with id " + id));

        existingRoutine.setName(updateRoutine.getName());
        // Aquí puede asignar otros campos de updateRoutine a existingRoutine según sea necesario

        return routineRepository.save(existingRoutine);
    }

    public void delete(Long id) {
        if (routineRepository.existsById(id)) {
            routineRepository.deleteById(id);
        } else {
            throw new RuntimeException("Routine not found with id " + id);
        }
    }
}
