package org.ironhack.projectfinalworkout.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.ironhack.projectfinalworkout.model.Exercise;
import org.ironhack.projectfinalworkout.repository.ExerciseRepository;
import org.ironhack.projectfinalworkout.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
@Slf4j
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercise save(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public List<Exercise> findAll() {
        return exerciseRepository.findAll();
    }

    public Exercise update(Long id, Exercise updatedExercise) {
        Exercise existingExercise = exerciseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exercise not found with id " + id));

        existingExercise.setName(updatedExercise.getName());

        return exerciseRepository.save(existingExercise);
    }

    public void delete(Long id) {
        if (exerciseRepository.existsById(id)) {
            exerciseRepository.deleteById(id);
        } else {
            throw new RuntimeException("Exercise not found with id " + id);
        }
    }
}
