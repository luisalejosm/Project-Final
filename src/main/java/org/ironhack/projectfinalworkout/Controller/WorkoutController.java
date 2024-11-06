package org.ironhack.projectfinalworkout.Controller;

import lombok.Getter;
import org.ironhack.projectfinalworkout.Model.Workout;
import org.ironhack.projectfinalworkout.Repository.WorkoutRepository;
import org.ironhack.projectfinalworkout.Service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Getter
@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
   private final WorkoutService workoutService;

   @Autowired
   public WorkoutController(WorkoutService workoutService){
       this.workoutService = workoutService;
   }


}
