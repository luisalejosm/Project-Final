package org.ironhack.projectfinalworkout.Controller;

import org.ironhack.projectfinalworkout.model.Workout;
import org.ironhack.projectfinalworkout.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {


   @Autowired
   public WorkoutService workoutService;

   @GetMapping
   public List<Workout> getAllWorkouts(){
      return workoutService.findAll();
   }

   @PostMapping
   public Workout createWorkout(@RequestBody Workout workout) {
      return workoutService.saveWorkout(workout);
   }

   @PutMapping("/{id}")
   public Workout updateWorkout(@PathVariable Long id, @RequestBody Workout workoutDetails) {
      Optional<Workout> optionalWorkout = Optional.ofNullable(workoutService.updateWorkout(id));
      if(optionalWorkout.isPresent()){

      }
      return workoutService.updateWorkout(id);
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteWorkout(@PathVariable Long id) {
      workoutService.deleteWorkout(id);
      return ResponseEntity.ok().build();
   }
}
