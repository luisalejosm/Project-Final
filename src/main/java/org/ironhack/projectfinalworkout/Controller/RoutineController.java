package org.ironhack.projectfinalworkout.Controller;

import org.ironhack.projectfinalworkout.model.Exercise;
import org.ironhack.projectfinalworkout.model.Routine;
import org.ironhack.projectfinalworkout.service.ExerciseService;
import org.ironhack.projectfinalworkout.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api/routine")
public class RoutineController {

    @Autowired
    private RoutineService routineService;
    @Autowired
    private ExerciseService exerciseService;


    @PostMapping
    public ResponseEntity<Routine> createRoutine(@RequestBody Routine routine){
        Routine savedRoutine = routineService.saveRoutine(routine);
        return new ResponseEntity<>(savedRoutine, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Routine> getAllRoutine(){
        return routineService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Routine> updateRoutine(@PathVariable Long id, @RequestBody Routine routine){
        Routine updateRoutine = routineService.update(id, routine);
        return ResponseEntity.ok(updateRoutine);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExercise(@PathVariable Long id){
        exerciseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
