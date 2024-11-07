package org.ironhack.projectfinalworkout.Controller;

import lombok.Getter;
import org.ironhack.projectfinalworkout.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {


   @Autowired
   public WorkoutRepository workoutRepository;

//   @GetMapping("{id}")
//    public ResponseEntity<Workout> getWorkoutById(@PathVariable("id") Long workoutId){
//       Optional<Workout> optionalWorkout = WorkoutRepository.findById(workoutId);
//       return null;
//   }


}
