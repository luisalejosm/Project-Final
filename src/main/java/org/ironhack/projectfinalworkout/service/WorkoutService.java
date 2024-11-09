package org.ironhack.projectfinalworkout.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.ironhack.projectfinalworkout.model.Workout;
import org.ironhack.projectfinalworkout.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository){

        this.workoutRepository = workoutRepository;
    }

//    public List<Workout> findRutine() {
//        return workoutRepository.findAllRutine();
//    }

    public Optional<Workout> findById(Long id){
        return workoutRepository.findById(id);
    }

    public Workout saveWorkout(Workout workout){
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long id) {
        Workout workout = workoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workout no encontrado con id: " + id));

        return workoutRepository.save(workout);
    }

    public void deleteWorkout(Long id){
        workoutRepository.deleteById(id);
    }
}
